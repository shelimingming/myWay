package com.myway.dao;

import com.myway.domain.AuthDo;
import com.myway.domain.AuthDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    long countByExample(AuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    int deleteByExample(AuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    int insert(AuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    int insertSelective(AuthDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    List<AuthDo> selectByExample(AuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AuthDo record, @Param("example") AuthDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AuthDo record, @Param("example") AuthDoExample example);
}