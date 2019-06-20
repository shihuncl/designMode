package template.jdbc;

import java.sql.ResultSet;

/**
 * ORM
 * Created by cl on 2019/6/19.
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
