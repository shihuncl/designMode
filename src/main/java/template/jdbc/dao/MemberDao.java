package template.jdbc.dao;

import template.jdbc.JdbcTemplate;
import template.jdbc.Member;
import template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by cl on 2019/6/19.
 */
public class MemberDao extends JdbcTemplate {


    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql="select * from t_member";
        return super.exceuteQuery(sql, new RowMapper<Member>() {

            public Member mapRow(ResultSet rs,int rowNum)throws Exception{
                Member member=new Member();
                //字段过多，原型模式
                member.setUsername("chenlei");
                member.setAdr("aaaaa");
                member.setAge(18);
                member.setNickname("ssss");
                member.setPassword("123456");
                return  member;
            }

        },null);
    }
}
