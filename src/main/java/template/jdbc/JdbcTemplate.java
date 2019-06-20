package template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cl on 2019/6/19.
 */
public abstract  class JdbcTemplate {

    private DataSource dataSource;


    public  JdbcTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }
    public List<?> exceuteQuery(String sql, RowMapper<?> rowMapper,Object[] values){
        try {
            //获取连接
            Connection connection=this.getCoonecton();
            //创建语句集
            PreparedStatement pstm= this.createPrepareStatement(connection,sql);
            //执行语句集
            ResultSet rs=this.exceuteQuery(pstm,values);
            //处理结果集
            List<?> result=this.paresResultSet(rs,rowMapper);
            //关闭结果集
            this.closeResultsSet(rs);
            //关闭语句集
            this.closeStatement(pstm);
            //关闭连接
            this.closeConnection(connection);

        }catch (Exception e){
            e.printStackTrace();
        }
        return  null ;
    }



    private void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    private void closeResultsSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }


    private List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception{
        List<Object> result=new ArrayList<>();
        int rowNum=1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum));
        }
        return  result;
    }


    private ResultSet exceuteQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i=0;i<values.length;i++){
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    public Connection getCoonecton() throws SQLException {
        return this.dataSource.getConnection();
    }
}
