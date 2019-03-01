package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Student;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author hbd
 * 实现ResultSet到User实体的转换
 */
public class StudentMapper implements RowMapper<Student> {
    /**
     * 实现ResultSet到User实体的转换
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
