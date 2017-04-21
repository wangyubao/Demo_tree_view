package com.zhy.bean;

import com.zhy.tree.bean.TreeNodeId;
import com.zhy.tree.bean.TreeNodeLabel;
import com.zhy.tree.bean.TreeNodePid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghui on 2017/3/2.
 */

public class MyBean {

    /**
     * code : 0
     * data : [{"depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","depa_name":"技术","depa_employees_count":13,"depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","departments":[{"depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd","depa_name":"技术1部","depa_employees_count":3,"depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"},{"depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5","depa_name":"技术2部","depa_employees_count":4,"depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"},{"depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0","depa_name":"技术3部","depa_employees_count":1,"depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"},{"depa_id":"99badbba-baf8-40ff-a004-31258a48a425","depa_name":"技术4部","depa_employees_count":4,"depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","departments":[{"depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582","depa_name":"4部1","depa_employees_count":1,"depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425"},{"depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1","depa_name":"4部2","depa_employees_count":1,"depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425"}]}]}]
     * msg : success
     * session_id : 769d4c209fa3930a967f3b6d8f4ca98dcc5f7761
     */

    public int code;
    public String msg;
    public String session_id;
    public List<ListBean> data;

    public static class ListBean {

        @TreeNodeId
        public int id;
        @TreeNodePid
        public int parentId;
        @TreeNodeLabel
        public String name;
        public String depa_id;
        public String depa_name;
        public int depa_employees_count;
        public String depa_type;
        public String depa_parent_id;
        public String employee_id;
        public String employee_name;
        public String employee_name_first_en;
        public String employee_avatar;
        public List<ListBean> departments = new ArrayList<ListBean>();
        public List<ListBean> employees = new ArrayList<ListBean>();
    }
}
