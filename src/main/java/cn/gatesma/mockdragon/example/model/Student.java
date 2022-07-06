package cn.gatesma.mockdragon.example.model;

import java.util.List;
import lombok.Data;

/**
 * Student
 *
 * @author by gatesma.
 */
@Data
public class Student {

    private String stuId;

    private Integer age;

    private Long money;

    private short size;

    private double height;

    private float weight;

    private List<String> classes;
}
