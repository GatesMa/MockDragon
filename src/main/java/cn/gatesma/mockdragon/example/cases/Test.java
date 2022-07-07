package cn.gatesma.mockdragon.example.cases;

import cn.gatesma.mockdragon.core.MockDragon;
import cn.gatesma.mockdragon.example.model.Student;
import com.alibaba.fastjson.JSONObject;

/**
 * Test
 *
 * @author by gatesma.
 */
public class Test {

    public static void main(String[] args) {
        Student instance = MockDragon.createInstance(Student.class);
        System.out.println(JSONObject.toJSONString(instance, true));
    }

}
