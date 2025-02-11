package vss;

import java.util.ArrayList;

public  class Util {
    public static ArrayList<String> putAll(){
        ArrayList<String> path = new ArrayList<>();
        path.add(VSS.AISwitch.UploadAIPhoneSwitchInfo);
        path.add(VSS.AISwitch.UploadAIWatchSwitchInfo);
        return path;
    }

    public static void main(String[] args) {

        Util util = new Util();
        ArrayList<String> strings = putAll();
        System.out.println(strings);
    }
}
