package com.zhy.bean;

import java.util.List;

/**
 * Created by 王辉 on 2017/4/13.
 */

public class ContactBean {

    /**
     * code : 0
     * data : [{"depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","depa_name":"重庆测试","depa_employees_count":22,"depa_type":"0","depa_parent_id":"","employees":[{"employee_id":"4ab5ccbe-7234-47f2-89b0-01f38a3b3d59","employee_name":"考勤拍照","employee_name_first_en":"kqpz","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"},{"employee_id":"658ffafe-d8d7-4dee-b50f-fb0befe1c44a","employee_name":"玩","employee_name_first_en":"w","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"},{"employee_id":"ea7b8f90-61de-4322-970e-b8c07767298c","employee_name":"奔腾","employee_name_first_en":"bt","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/ea7b8f90-61de-4322-970e-b8c07767298c/e94f18fb62b25c4c52bb8d0cfbf81d70_594x594.jpg","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"}],"departments":[{"depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","depa_name":"技术","depa_employees_count":13,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"3b85fdbf-651d-4433-a0c0-94b5871874f7","employee_name":"张一","employee_name_first_en":"zy","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/3b85fdbf-651d-4433-a0c0-94b5871874f7/2243288d0bd0d52d9e8ba86ef7fa858c_1050x1273.jpg","depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"}],"departments":[{"depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd","depa_name":"技术1部","depa_employees_count":3,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"4e405030-9dd5-4e73-94bd-c5ae1bfcc581","employee_name":"王五五五","employee_name_first_en":"wwww","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/4e405030-9dd5-4e73-94bd-c5ae1bfcc581/6fdbeba319f64b631ad76ba106f38db3_960x1280.","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"2f880f5a-22f3-4d2a-943e-fd91c8fc8a9b","employee_name":"彩英","employee_name_first_en":"cy","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"a2383bf9-06f7-4d5c-852a-538a197d7514","employee_name":"王单","employee_name_first_en":"wd","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/a2383bf9-06f7-4d5c-852a-538a197d7514/8bf1202b3b060c698bd477a3d63bab90_768x432.jpg","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"dfb6db5c-b01e-4d1a-9def-663b39b9ad20","employee_name":"李四四","employee_name_first_en":"lss","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"}]},{"depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5","depa_name":"技术2部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"7c733602-e111-40cf-b32a-09f66af754a2","employee_name":"技术部2部老大","employee_name_first_en":"jsb2bld","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"6e6a24bc-810d-4c56-a27c-9e3e9b14bdfc","employee_name":"李四","employee_name_first_en":"ls","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"9db0962d-dfab-493d-a41c-bffd67b69a51","employee_name":"李五","employee_name_first_en":"lw","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/9db0962d-dfab-493d-a41c-bffd67b69a51/6f6f2c0bc07c1cf4dd709c27d53e73e8_936x1248.jpg","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"e9f3f60e-d182-4280-b8ba-6bd5e15b06de","employee_name":"唇彩","employee_name_first_en":"cc","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"}]},{"depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0","depa_name":"技术3部","depa_employees_count":1,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"8734164c-4891-40fc-98dd-3e2a9cd9305f","employee_name":"东华帝君","employee_name_first_en":"dhdj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0"}]},{"depa_id":"99badbba-baf8-40ff-a004-31258a48a425","depa_name":"技术4部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c","employee_name":"夜华","employee_name_first_en":"yh","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c/31d4077fccdf4e5d50e91e321d1db1ca_120x120.","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"},{"employee_id":"e679dd79-f066-42e3-bb71-6bf01e87d6b3","employee_name":"素素","employee_name_first_en":"ss","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"}],"departments":[{"depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582","depa_name":"4部1","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"99d52525-2f38-4540-91c8-ab2950776b0c","employee_name":"树精","employee_name_first_en":"sj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582"}]},{"depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1","depa_name":"4部2","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"e4f4d62f-8228-4ec0-bcf9-66b8869b19c9","employee_name":"蘑菇精","employee_name_first_en":"mgj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1"}]}]}]},{"depa_id":"d1324512-384a-4e93-a841-7830feb733d9","depa_name":"开发","depa_employees_count":2,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"1477b97a-26fd-4b7b-b0fc-8f5fb593ebaf","employee_name":"张大","employee_name_first_en":"zd","employee_avatar":"","depa_id":"d1324512-384a-4e93-a841-7830feb733d9"}],"departments":[{"depa_id":"f7d67839-24c4-48e7-a8ec-627fbff8cbe6","depa_name":"and","depa_employees_count":1,"depa_type":"0","depa_parent_id":"d1324512-384a-4e93-a841-7830feb733d9","employees":[{"employee_id":"90902c3f-d85c-4176-aa8a-b3f4d6a40a85","employee_name":" 洪","employee_name_first_en":" h","employee_avatar":"","depa_id":"f7d67839-24c4-48e7-a8ec-627fbff8cbe6"}]},{"depa_id":"442088b4-6aca-46b8-bd02-80290f35e30a","depa_name":"ios","depa_employees_count":0,"depa_type":"0","depa_parent_id":"d1324512-384a-4e93-a841-7830feb733d9"}]},{"depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00","depa_name":"未分配部门","depa_employees_count":3,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"ed99d4a2-eab7-4bb0-9d48-40051df88ac3","employee_name":"彩卡","employee_name_first_en":"ck","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/ed99d4a2-eab7-4bb0-9d48-40051df88ac3/191cec3823c4a8ffd29651bad265fc94_120x120.","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"},{"employee_id":"2eb5778d-c288-454c-b4d8-a36ff4e778ef","employee_name":"杨2","employee_name_first_en":"y2","employee_avatar":"","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"},{"employee_id":"697b9ba3-5dcb-4e08-8501-1af18ac58353","employee_name":"杨1","employee_name_first_en":"y1","employee_avatar":"","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"}]}]}]
     * msg : success
     * session_id : 775fc7442829029d980715ecb7a0c859b90bf0d1
     */

    public int code;
    public String msg;
    public String session_id;
    public List<DataBean> data;

    public static class DataBean {
        /**
         * depa_id : e38abd6e-51b5-4a21-8143-bdae84f39104
         * depa_name : 重庆测试
         * depa_employees_count : 22
         * depa_type : 0
         * depa_parent_id :
         * employees : [{"employee_id":"4ab5ccbe-7234-47f2-89b0-01f38a3b3d59","employee_name":"考勤拍照","employee_name_first_en":"kqpz","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"},{"employee_id":"658ffafe-d8d7-4dee-b50f-fb0befe1c44a","employee_name":"玩","employee_name_first_en":"w","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"},{"employee_id":"ea7b8f90-61de-4322-970e-b8c07767298c","employee_name":"奔腾","employee_name_first_en":"bt","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/ea7b8f90-61de-4322-970e-b8c07767298c/e94f18fb62b25c4c52bb8d0cfbf81d70_594x594.jpg","depa_id":"e38abd6e-51b5-4a21-8143-bdae84f39104"}]
         * departments : [{"depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","depa_name":"技术","depa_employees_count":13,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"3b85fdbf-651d-4433-a0c0-94b5871874f7","employee_name":"张一","employee_name_first_en":"zy","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/3b85fdbf-651d-4433-a0c0-94b5871874f7/2243288d0bd0d52d9e8ba86ef7fa858c_1050x1273.jpg","depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"}],"departments":[{"depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd","depa_name":"技术1部","depa_employees_count":3,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"4e405030-9dd5-4e73-94bd-c5ae1bfcc581","employee_name":"王五五五","employee_name_first_en":"wwww","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/4e405030-9dd5-4e73-94bd-c5ae1bfcc581/6fdbeba319f64b631ad76ba106f38db3_960x1280.","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"2f880f5a-22f3-4d2a-943e-fd91c8fc8a9b","employee_name":"彩英","employee_name_first_en":"cy","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"a2383bf9-06f7-4d5c-852a-538a197d7514","employee_name":"王单","employee_name_first_en":"wd","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/a2383bf9-06f7-4d5c-852a-538a197d7514/8bf1202b3b060c698bd477a3d63bab90_768x432.jpg","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"dfb6db5c-b01e-4d1a-9def-663b39b9ad20","employee_name":"李四四","employee_name_first_en":"lss","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"}]},{"depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5","depa_name":"技术2部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"7c733602-e111-40cf-b32a-09f66af754a2","employee_name":"技术部2部老大","employee_name_first_en":"jsb2bld","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"6e6a24bc-810d-4c56-a27c-9e3e9b14bdfc","employee_name":"李四","employee_name_first_en":"ls","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"9db0962d-dfab-493d-a41c-bffd67b69a51","employee_name":"李五","employee_name_first_en":"lw","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/9db0962d-dfab-493d-a41c-bffd67b69a51/6f6f2c0bc07c1cf4dd709c27d53e73e8_936x1248.jpg","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"e9f3f60e-d182-4280-b8ba-6bd5e15b06de","employee_name":"唇彩","employee_name_first_en":"cc","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"}]},{"depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0","depa_name":"技术3部","depa_employees_count":1,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"8734164c-4891-40fc-98dd-3e2a9cd9305f","employee_name":"东华帝君","employee_name_first_en":"dhdj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0"}]},{"depa_id":"99badbba-baf8-40ff-a004-31258a48a425","depa_name":"技术4部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c","employee_name":"夜华","employee_name_first_en":"yh","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c/31d4077fccdf4e5d50e91e321d1db1ca_120x120.","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"},{"employee_id":"e679dd79-f066-42e3-bb71-6bf01e87d6b3","employee_name":"素素","employee_name_first_en":"ss","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"}],"departments":[{"depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582","depa_name":"4部1","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"99d52525-2f38-4540-91c8-ab2950776b0c","employee_name":"树精","employee_name_first_en":"sj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582"}]},{"depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1","depa_name":"4部2","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"e4f4d62f-8228-4ec0-bcf9-66b8869b19c9","employee_name":"蘑菇精","employee_name_first_en":"mgj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1"}]}]}]},{"depa_id":"d1324512-384a-4e93-a841-7830feb733d9","depa_name":"开发","depa_employees_count":2,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"1477b97a-26fd-4b7b-b0fc-8f5fb593ebaf","employee_name":"张大","employee_name_first_en":"zd","employee_avatar":"","depa_id":"d1324512-384a-4e93-a841-7830feb733d9"}],"departments":[{"depa_id":"f7d67839-24c4-48e7-a8ec-627fbff8cbe6","depa_name":"and","depa_employees_count":1,"depa_type":"0","depa_parent_id":"d1324512-384a-4e93-a841-7830feb733d9","employees":[{"employee_id":"90902c3f-d85c-4176-aa8a-b3f4d6a40a85","employee_name":" 洪","employee_name_first_en":" h","employee_avatar":"","depa_id":"f7d67839-24c4-48e7-a8ec-627fbff8cbe6"}]},{"depa_id":"442088b4-6aca-46b8-bd02-80290f35e30a","depa_name":"ios","depa_employees_count":0,"depa_type":"0","depa_parent_id":"d1324512-384a-4e93-a841-7830feb733d9"}]},{"depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00","depa_name":"未分配部门","depa_employees_count":3,"depa_type":"0","depa_parent_id":"e38abd6e-51b5-4a21-8143-bdae84f39104","employees":[{"employee_id":"ed99d4a2-eab7-4bb0-9d48-40051df88ac3","employee_name":"彩卡","employee_name_first_en":"ck","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/ed99d4a2-eab7-4bb0-9d48-40051df88ac3/191cec3823c4a8ffd29651bad265fc94_120x120.","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"},{"employee_id":"2eb5778d-c288-454c-b4d8-a36ff4e778ef","employee_name":"杨2","employee_name_first_en":"y2","employee_avatar":"","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"},{"employee_id":"697b9ba3-5dcb-4e08-8501-1af18ac58353","employee_name":"杨1","employee_name_first_en":"y1","employee_avatar":"","depa_id":"d29313ec-bef5-4d24-98d8-d39331389d00"}]}]
         */

        public String depa_id;
        public String depa_name;
        public int depa_employees_count;
        public String depa_type;
        public String depa_parent_id;
        public List<EmployeesBean> employees;
        public List<DepartmentsBeanXX> departments;

        public static class EmployeesBean {
            /**
             * employee_id : 4ab5ccbe-7234-47f2-89b0-01f38a3b3d59
             * employee_name : 考勤拍照
             * employee_name_first_en : kqpz
             * employee_avatar : http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png
             * depa_id : e38abd6e-51b5-4a21-8143-bdae84f39104
             */

            public String employee_id;
            public String employee_name;
            public String employee_name_first_en;
            public String employee_avatar;
            public String depa_id;
        }

        public static class DepartmentsBeanXX {
            /**
             * depa_id : 113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4
             * depa_name : 技术
             * depa_employees_count : 13
             * depa_type : 0
             * depa_parent_id : e38abd6e-51b5-4a21-8143-bdae84f39104
             * employees : [{"employee_id":"3b85fdbf-651d-4433-a0c0-94b5871874f7","employee_name":"张一","employee_name_first_en":"zy","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/3b85fdbf-651d-4433-a0c0-94b5871874f7/2243288d0bd0d52d9e8ba86ef7fa858c_1050x1273.jpg","depa_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4"}]
             * departments : [{"depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd","depa_name":"技术1部","depa_employees_count":3,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"4e405030-9dd5-4e73-94bd-c5ae1bfcc581","employee_name":"王五五五","employee_name_first_en":"wwww","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/4e405030-9dd5-4e73-94bd-c5ae1bfcc581/6fdbeba319f64b631ad76ba106f38db3_960x1280.","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"2f880f5a-22f3-4d2a-943e-fd91c8fc8a9b","employee_name":"彩英","employee_name_first_en":"cy","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"a2383bf9-06f7-4d5c-852a-538a197d7514","employee_name":"王单","employee_name_first_en":"wd","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/a2383bf9-06f7-4d5c-852a-538a197d7514/8bf1202b3b060c698bd477a3d63bab90_768x432.jpg","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"dfb6db5c-b01e-4d1a-9def-663b39b9ad20","employee_name":"李四四","employee_name_first_en":"lss","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"}]},{"depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5","depa_name":"技术2部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"7c733602-e111-40cf-b32a-09f66af754a2","employee_name":"技术部2部老大","employee_name_first_en":"jsb2bld","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"6e6a24bc-810d-4c56-a27c-9e3e9b14bdfc","employee_name":"李四","employee_name_first_en":"ls","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"9db0962d-dfab-493d-a41c-bffd67b69a51","employee_name":"李五","employee_name_first_en":"lw","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/9db0962d-dfab-493d-a41c-bffd67b69a51/6f6f2c0bc07c1cf4dd709c27d53e73e8_936x1248.jpg","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"},{"employee_id":"e9f3f60e-d182-4280-b8ba-6bd5e15b06de","employee_name":"唇彩","employee_name_first_en":"cc","employee_avatar":"","depa_id":"dc7a2e44-6d25-4069-95a2-4c080fc573b5"}]},{"depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0","depa_name":"技术3部","depa_employees_count":1,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"8734164c-4891-40fc-98dd-3e2a9cd9305f","employee_name":"东华帝君","employee_name_first_en":"dhdj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0"}]},{"depa_id":"99badbba-baf8-40ff-a004-31258a48a425","depa_name":"技术4部","depa_employees_count":4,"depa_type":"0","depa_parent_id":"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4","employees":[{"employee_id":"c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c","employee_name":"夜华","employee_name_first_en":"yh","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c/31d4077fccdf4e5d50e91e321d1db1ca_120x120.","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"},{"employee_id":"e679dd79-f066-42e3-bb71-6bf01e87d6b3","employee_name":"素素","employee_name_first_en":"ss","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"99badbba-baf8-40ff-a004-31258a48a425"}],"departments":[{"depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582","depa_name":"4部1","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"99d52525-2f38-4540-91c8-ab2950776b0c","employee_name":"树精","employee_name_first_en":"sj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582"}]},{"depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1","depa_name":"4部2","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"e4f4d62f-8228-4ec0-bcf9-66b8869b19c9","employee_name":"蘑菇精","employee_name_first_en":"mgj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1"}]}]}]
             */

            public String depa_id;
            public String depa_name;
            public int depa_employees_count;
            public String depa_type;
            public String depa_parent_id;
            public List<EmployeesBeanX> employees;
            public List<DepartmentsBeanX> departments;

            public static class EmployeesBeanX {
                /**
                 * employee_id : 3b85fdbf-651d-4433-a0c0-94b5871874f7
                 * employee_name : 张一
                 * employee_name_first_en : zy
                 * employee_avatar : http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/3b85fdbf-651d-4433-a0c0-94b5871874f7/2243288d0bd0d52d9e8ba86ef7fa858c_1050x1273.jpg
                 * depa_id : 113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4
                 */

                public String employee_id;
                public String employee_name;
                public String employee_name_first_en;
                public String employee_avatar;
                public String depa_id;
            }

            public static class DepartmentsBeanX {
                /**
                 * depa_id : 3b7a03a5-8e7e-422b-ae6d-a0367c7629cd
                 * depa_name : 技术1部
                 * depa_employees_count : 3
                 * depa_type : 0
                 * depa_parent_id : 113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4
                 * employees : [{"employee_id":"4e405030-9dd5-4e73-94bd-c5ae1bfcc581","employee_name":"王五五五","employee_name_first_en":"wwww","employee_avatar":"http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/4e405030-9dd5-4e73-94bd-c5ae1bfcc581/6fdbeba319f64b631ad76ba106f38db3_960x1280.","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"2f880f5a-22f3-4d2a-943e-fd91c8fc8a9b","employee_name":"彩英","employee_name_first_en":"cy","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"a2383bf9-06f7-4d5c-852a-538a197d7514","employee_name":"王单","employee_name_first_en":"wd","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/a2383bf9-06f7-4d5c-852a-538a197d7514/8bf1202b3b060c698bd477a3d63bab90_768x432.jpg","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"},{"employee_id":"dfb6db5c-b01e-4d1a-9def-663b39b9ad20","employee_name":"李四四","employee_name_first_en":"lss","employee_avatar":"","depa_id":"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd"}]
                 * departments : [{"depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582","depa_name":"4部1","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"99d52525-2f38-4540-91c8-ab2950776b0c","employee_name":"树精","employee_name_first_en":"sj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582"}]},{"depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1","depa_name":"4部2","depa_employees_count":1,"depa_type":"0","depa_parent_id":"99badbba-baf8-40ff-a004-31258a48a425","employees":[{"employee_id":"e4f4d62f-8228-4ec0-bcf9-66b8869b19c9","employee_name":"蘑菇精","employee_name_first_en":"mgj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"055358bf-b80c-425c-a8c2-8bba688aeac1"}]}]
                 */

                public String depa_id;
                public String depa_name;
                public int depa_employees_count;
                public String depa_type;
                public String depa_parent_id;
                public List<EmployeesBeanXX> employees;
                public List<DepartmentsBean> departments;

                public static class EmployeesBeanXX {
                    /**
                     * employee_id : 4e405030-9dd5-4e73-94bd-c5ae1bfcc581
                     * employee_name : 王五五五
                     * employee_name_first_en : wwww
                     * employee_avatar : http://xiaomi-im-test.oss-cn-qingdao.aliyuncs.com/31b7ac77-2853-4931-8bca-9be0658ec5ca/4e405030-9dd5-4e73-94bd-c5ae1bfcc581/6fdbeba319f64b631ad76ba106f38db3_960x1280.
                     * depa_id : 3b7a03a5-8e7e-422b-ae6d-a0367c7629cd
                     */

                    public String employee_id;
                    public String employee_name;
                    public String employee_name_first_en;
                    public String employee_avatar;
                    public String depa_id;
                }

                public static class DepartmentsBean {
                    /**
                     * depa_id : 5467a964-7908-4c83-873d-a97bfa1a0582
                     * depa_name : 4部1
                     * depa_employees_count : 1
                     * depa_type : 0
                     * depa_parent_id : 99badbba-baf8-40ff-a004-31258a48a425
                     * employees : [{"employee_id":"99d52525-2f38-4540-91c8-ab2950776b0c","employee_name":"树精","employee_name_first_en":"sj","employee_avatar":"http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png","depa_id":"5467a964-7908-4c83-873d-a97bfa1a0582"}]
                     */

                    public String depa_id;
                    public String depa_name;
                    public int depa_employees_count;
                    public String depa_type;
                    public String depa_parent_id;
                    public List<EmployeesBeanXXX> employees;

                    public static class EmployeesBeanXXX {
                        /**
                         * employee_id : 99d52525-2f38-4540-91c8-ab2950776b0c
                         * employee_name : 树精
                         * employee_name_first_en : sj
                         * employee_avatar : http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/A4AB1729-36B5-B2A6-F0A3-90B26845A110/d437420cb4efef1674a89f60a6d3b26d.png
                         * depa_id : 5467a964-7908-4c83-873d-a97bfa1a0582
                         */

                        public String employee_id;
                        public String employee_name;
                        public String employee_name_first_en;
                        public String employee_avatar;
                        public String depa_id;
                    }
                }
            }
        }
    }
}
