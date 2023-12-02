package com.example.demo.entities;


import com.example.demo.helpers.Indices;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@Document(indexName = Indices.PERSON_INDEX)
@Setting(settingPath = "static/es-setting.json")
public class Vehicle {
    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String name;
}
