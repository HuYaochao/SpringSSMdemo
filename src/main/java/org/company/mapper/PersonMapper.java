package org.company.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.company.entity.Person;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> find();
}
