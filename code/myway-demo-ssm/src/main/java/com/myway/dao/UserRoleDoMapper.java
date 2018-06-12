package com.myway.dao;

import com.myway.domain.UserRoleDo;
import com.myway.domain.UserRoleDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    long countByExample(UserRoleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int deleteByExample(UserRoleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int insert(UserRoleDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int insertSelective(UserRoleDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    List<UserRoleDo> selectByExample(UserRoleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserRoleDo record, @Param("example") UserRoleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserRoleDo record, @Param("example") UserRoleDoExample example);
}