package cn.gatesma.mockdragon.utils;

import cn.gatesma.mockdragon.core.MockDragon;
import cn.gatesma.mockdragon.domin.CollectionMockConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 集合处理
 *
 * @author by gatesma.
 */
public class CollectionMockUtils {


    public static List<Object> randomList(CollectionMockConfig config) {
        List<Object> curEleList = new ArrayList<>();
        while (curEleList.size() < config.getSize()) {
            curEleList.add(MockDragon.createInstance(config.getClazz()));
        }
        return curEleList;
    }

    public static Set<Object> randomSet(CollectionMockConfig config) {
        Set<Object> curEleSet = new HashSet<>();
        while (curEleSet.size() < config.getSize()) {
            curEleSet.add(MockDragon.createInstance(config.getClazz()));
        }
        return curEleSet;
    }

}
