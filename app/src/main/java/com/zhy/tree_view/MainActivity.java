package com.zhy.tree_view;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zhy.bean.Bean;
import com.zhy.bean.FileBean;
import com.zhy.bean.MyBean;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;
import com.zhy.tree.bean.TreeListViewAdapter.OnTreeNodeClickListener;

public class MainActivity extends Activity
{
	private List<Bean> mDatas = new ArrayList<Bean>();
	private List<FileBean> mDatas2 = new ArrayList<FileBean>();
	private List<MyBean.ListBean> mDepartmentList = new ArrayList<MyBean.ListBean>();
 	private MyBean myBean;
	private ListView mTree;
	private SimpleTreeAdapter mAdapter;
	private ImageView ivCustomer;//我的客户   selectPosition = -2
	private ImageView ivShareCustomer;//共享给我的客户  selectPosition = -1
	private ImageView ivSubCustomer;//共享给我的客户  selectPosition = -3

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		initMyData();
//		initDatas();
		initNewData();
		initView();


	}

	private void initView() {
		mTree = (ListView) findViewById(R.id.id_tree);
		ivCustomer = (ImageView) findViewById(R.id.iv_select_customer);
		ivShareCustomer = (ImageView) findViewById(R.id.iv_select_share);
		ivSubCustomer = (ImageView) findViewById(R.id.iv_sub_customer);
		try
		{
			mAdapter = new SimpleTreeAdapter<MyBean.ListBean>(mTree, this, mDepartmentList, 10);
			mAdapter.setOnTreeNodeClickListener(new OnTreeNodeClickListener()
			{
				@Override
				public void onClick(Node node, int position)
				{
					if (node.isLeaf())
					{
						Toast.makeText(getApplicationContext(), node.getName() + node.getDepa_id() + node.getDepa_employees_count(),
								Toast.LENGTH_SHORT).show();
					}
				}

			});

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		mTree.setAdapter(mAdapter);

		ivCustomer.setSelected(true);
		ivCustomer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (!v.isSelected()) {
					ivCustomer.setSelected(true);
					int selectPosition = mAdapter.getSelectPosition();
					if (selectPosition >= 0) {
						mAdapter.unSelectNode(selectPosition);
					} else if (selectPosition == -1) {
						ivShareCustomer.setSelected(false);
					} else {
						ivSubCustomer.setSelected(false);
					}

					mAdapter.setSelectPosition(-2);
				}
			}
		});
		ivShareCustomer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (!v.isSelected()) {
					v.setSelected(true);
					int selectPosition = mAdapter.getSelectPosition();
					if (selectPosition >= 0) {
						mAdapter.unSelectNode(selectPosition);
					} else {
						ivCustomer.setSelected(false);
						ivSubCustomer.setSelected(false);
					}


					mAdapter.setSelectPosition(-1);
				}
			}
		});
		ivSubCustomer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (!v.isSelected()) {
					v.setSelected(true);
					int selectPosition = mAdapter.getSelectPosition();
					if (selectPosition >= 0) {
						mAdapter.unSelectNode(selectPosition);
					} else {
						ivShareCustomer.setSelected(false);
						ivCustomer.setSelected(false);
					}

					mAdapter.setSelectPosition(-3);
				}
			}
		});

		mAdapter.setOnTreeNodeSelectListener(new SimpleTreeAdapter.OnTreeNodeSelectListener() {
			@Override
			public void onTreeNodeSelect() {
				ivCustomer.setSelected(false);
				ivShareCustomer.setSelected(false);
				ivSubCustomer.setSelected(false);
			}
		});
	}

	private void initNewData() {
		String json = "{\"code\":0,\"data\":[{\"depa_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\",\"depa_name\":\"\\u91cd\\u5e86\\u6d4b\\u8bd5\",\"depa_employees_count\":22,\"depa_type\":\"0\",\"depa_parent_id\":\"\",\"employees\":[{\"employee_id\":\"4ab5ccbe-7234-47f2-89b0-01f38a3b3d59\",\"employee_name\":\"\\u8003\\u52e4\\u62cd\\u7167\",\"employee_name_first_en\":\"kqpz\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\"},{\"employee_id\":\"658ffafe-d8d7-4dee-b50f-fb0befe1c44a\",\"employee_name\":\"\\u73a9\",\"employee_name_first_en\":\"w\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\"},{\"employee_id\":\"ea7b8f90-61de-4322-970e-b8c07767298c\",\"employee_name\":\"\\u5954\\u817e\",\"employee_name_first_en\":\"bt\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/ea7b8f90-61de-4322-970e-b8c07767298c\\/e94f18fb62b25c4c52bb8d0cfbf81d70_594x594.jpg\",\"depa_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\"}],\"departments\":[{\"depa_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"depa_name\":\"\\u6280\\u672f\",\"depa_employees_count\":13,\"depa_type\":\"0\",\"depa_parent_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\",\"employees\":[{\"employee_id\":\"3b85fdbf-651d-4433-a0c0-94b5871874f7\",\"employee_name\":\"\\u5f20\\u4e00\",\"employee_name_first_en\":\"zy\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/3b85fdbf-651d-4433-a0c0-94b5871874f7\\/2243288d0bd0d52d9e8ba86ef7fa858c_1050x1273.jpg\",\"depa_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\"}],\"departments\":[{\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\",\"depa_name\":\"\\u6280\\u672f1\\u90e8\",\"depa_employees_count\":3,\"depa_type\":\"0\",\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"employees\":[{\"employee_id\":\"4e405030-9dd5-4e73-94bd-c5ae1bfcc581\",\"employee_name\":\"\\u738b\\u4e94\\u4e94\\u4e94\",\"employee_name_first_en\":\"wwww\",\"employee_avatar\":\"http:\\/\\/xiaomi-im-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/4e405030-9dd5-4e73-94bd-c5ae1bfcc581\\/6fdbeba319f64b631ad76ba106f38db3_960x1280.\",\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\"},{\"employee_id\":\"2f880f5a-22f3-4d2a-943e-fd91c8fc8a9b\",\"employee_name\":\"\\u5f69\\u82f1\",\"employee_name_first_en\":\"cy\",\"employee_avatar\":\"\",\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\"},{\"employee_id\":\"a2383bf9-06f7-4d5c-852a-538a197d7514\",\"employee_name\":\"\\u738b\\u5355\",\"employee_name_first_en\":\"wd\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/a2383bf9-06f7-4d5c-852a-538a197d7514\\/8bf1202b3b060c698bd477a3d63bab90_768x432.jpg\",\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\"},{\"employee_id\":\"dfb6db5c-b01e-4d1a-9def-663b39b9ad20\",\"employee_name\":\"\\u674e\\u56db\\u56db\",\"employee_name_first_en\":\"lss\",\"employee_avatar\":\"\",\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\"}]},{\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\",\"depa_name\":\"\\u6280\\u672f2\\u90e8\",\"depa_employees_count\":4,\"depa_type\":\"0\",\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"employees\":[{\"employee_id\":\"7c733602-e111-40cf-b32a-09f66af754a2\",\"employee_name\":\"\\u6280\\u672f\\u90e82\\u90e8\\u8001\\u5927\",\"employee_name_first_en\":\"jsb2bld\",\"employee_avatar\":\"\",\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\"},{\"employee_id\":\"6e6a24bc-810d-4c56-a27c-9e3e9b14bdfc\",\"employee_name\":\"\\u674e\\u56db\",\"employee_name_first_en\":\"ls\",\"employee_avatar\":\"\",\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\"},{\"employee_id\":\"9db0962d-dfab-493d-a41c-bffd67b69a51\",\"employee_name\":\"\\u674e\\u4e94\",\"employee_name_first_en\":\"lw\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/9db0962d-dfab-493d-a41c-bffd67b69a51\\/6f6f2c0bc07c1cf4dd709c27d53e73e8_936x1248.jpg\",\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\"},{\"employee_id\":\"e9f3f60e-d182-4280-b8ba-6bd5e15b06de\",\"employee_name\":\"\\u5507\\u5f69\",\"employee_name_first_en\":\"cc\",\"employee_avatar\":\"\",\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\"}]},{\"depa_id\":\"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0\",\"depa_name\":\"\\u6280\\u672f3\\u90e8\",\"depa_employees_count\":1,\"depa_type\":\"0\",\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"employees\":[{\"employee_id\":\"8734164c-4891-40fc-98dd-3e2a9cd9305f\",\"employee_name\":\"\\u4e1c\\u534e\\u5e1d\\u541b\",\"employee_name_first_en\":\"dhdj\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0\"}]},{\"depa_id\":\"99badbba-baf8-40ff-a004-31258a48a425\",\"depa_name\":\"\\u6280\\u672f4\\u90e8\",\"depa_employees_count\":4,\"depa_type\":\"0\",\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"employees\":[{\"employee_id\":\"c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c\",\"employee_name\":\"\\u591c\\u534e\",\"employee_name_first_en\":\"yh\",\"employee_avatar\":\"http:\\/\\/xiaomi-im-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/c5b5738e-62e7-4deb-b0e5-789b2ecc5d0c\\/31d4077fccdf4e5d50e91e321d1db1ca_120x120.\",\"depa_id\":\"99badbba-baf8-40ff-a004-31258a48a425\"},{\"employee_id\":\"e679dd79-f066-42e3-bb71-6bf01e87d6b3\",\"employee_name\":\"\\u7d20\\u7d20\",\"employee_name_first_en\":\"ss\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"99badbba-baf8-40ff-a004-31258a48a425\"}],\"departments\":[{\"depa_id\":\"5467a964-7908-4c83-873d-a97bfa1a0582\",\"depa_name\":\"4\\u90e81\",\"depa_employees_count\":1,\"depa_type\":\"0\",\"depa_parent_id\":\"99badbba-baf8-40ff-a004-31258a48a425\",\"employees\":[{\"employee_id\":\"99d52525-2f38-4540-91c8-ab2950776b0c\",\"employee_name\":\"\\u6811\\u7cbe\",\"employee_name_first_en\":\"sj\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"5467a964-7908-4c83-873d-a97bfa1a0582\"}]},{\"depa_id\":\"055358bf-b80c-425c-a8c2-8bba688aeac1\",\"depa_name\":\"4\\u90e82\",\"depa_employees_count\":1,\"depa_type\":\"0\",\"depa_parent_id\":\"99badbba-baf8-40ff-a004-31258a48a425\",\"employees\":[{\"employee_id\":\"e4f4d62f-8228-4ec0-bcf9-66b8869b19c9\",\"employee_name\":\"\\u8611\\u83c7\\u7cbe\",\"employee_name_first_en\":\"mgj\",\"employee_avatar\":\"http:\\/\\/xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com\\/A4AB1729-36B5-B2A6-F0A3-90B26845A110\\/d437420cb4efef1674a89f60a6d3b26d.png\",\"depa_id\":\"055358bf-b80c-425c-a8c2-8bba688aeac1\"}]}]}]},{\"depa_id\":\"d1324512-384a-4e93-a841-7830feb733d9\",\"depa_name\":\"\\u5f00\\u53d1\",\"depa_employees_count\":2,\"depa_type\":\"0\",\"depa_parent_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\",\"employees\":[{\"employee_id\":\"1477b97a-26fd-4b7b-b0fc-8f5fb593ebaf\",\"employee_name\":\"\\u5f20\\u5927\",\"employee_name_first_en\":\"zd\",\"employee_avatar\":\"\",\"depa_id\":\"d1324512-384a-4e93-a841-7830feb733d9\"}],\"departments\":[{\"depa_id\":\"f7d67839-24c4-48e7-a8ec-627fbff8cbe6\",\"depa_name\":\"and\",\"depa_employees_count\":1,\"depa_type\":\"0\",\"depa_parent_id\":\"d1324512-384a-4e93-a841-7830feb733d9\",\"employees\":[{\"employee_id\":\"90902c3f-d85c-4176-aa8a-b3f4d6a40a85\",\"employee_name\":\" \\u6d2a\",\"employee_name_first_en\":\" h\",\"employee_avatar\":\"\",\"depa_id\":\"f7d67839-24c4-48e7-a8ec-627fbff8cbe6\"}]},{\"depa_id\":\"442088b4-6aca-46b8-bd02-80290f35e30a\",\"depa_name\":\"ios\",\"depa_employees_count\":0,\"depa_type\":\"0\",\"depa_parent_id\":\"d1324512-384a-4e93-a841-7830feb733d9\"}]},{\"depa_id\":\"d29313ec-bef5-4d24-98d8-d39331389d00\",\"depa_name\":\"\\u672a\\u5206\\u914d\\u90e8\\u95e8\",\"depa_employees_count\":3,\"depa_type\":\"0\",\"depa_parent_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\",\"employees\":[{\"employee_id\":\"ed99d4a2-eab7-4bb0-9d48-40051df88ac3\",\"employee_name\":\"\\u5f69\\u5361\",\"employee_name_first_en\":\"ck\",\"employee_avatar\":\"http:\\/\\/xiaomi-im-test.oss-cn-qingdao.aliyuncs.com\\/31b7ac77-2853-4931-8bca-9be0658ec5ca\\/ed99d4a2-eab7-4bb0-9d48-40051df88ac3\\/191cec3823c4a8ffd29651bad265fc94_120x120.\",\"depa_id\":\"d29313ec-bef5-4d24-98d8-d39331389d00\"},{\"employee_id\":\"2eb5778d-c288-454c-b4d8-a36ff4e778ef\",\"employee_name\":\"\\u67682\",\"employee_name_first_en\":\"y2\",\"employee_avatar\":\"\",\"depa_id\":\"d29313ec-bef5-4d24-98d8-d39331389d00\"},{\"employee_id\":\"697b9ba3-5dcb-4e08-8501-1af18ac58353\",\"employee_name\":\"\\u67681\",\"employee_name_first_en\":\"y1\",\"employee_avatar\":\"\",\"depa_id\":\"d29313ec-bef5-4d24-98d8-d39331389d00\"}]}]}],\"msg\":\"success\",\"session_id\":\"775fc7442829029d980715ecb7a0c859b90bf0d1\"}";
		myBean = new Gson().fromJson(json, MyBean.class);
		Log.i("=========", new Gson().toJson(myBean));
		traverseNewDataList(myBean.data, 0);
	}

	int i = 0;
	private void traverseNewDataList(List<MyBean.ListBean> departmentList, int parentId) {
		for (int j = 0; j < departmentList.size(); j++) {
			MyBean.ListBean listBean = departmentList.get(j);
			i++;
			listBean.id = i;
			listBean.parentId = parentId;
			mDepartmentList.add(listBean);
			if (listBean.employee_name != null) {
				listBean.name = listBean.employee_name;
			} else {
				listBean.name = listBean.depa_name;
			}

			if (listBean.departments.size() > 0) {
				listBean.employees.addAll(listBean.departments);
			}
			if (listBean.employees.size() > 0) {
				traverseNewDataList(listBean.employees, i);
			}
		}
	}


	private void initMyData() {
		String json = "{\"code\":0,\"data\":[{\"depa_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"depa_name\":\"技术\",\"depa_employees_count\":13,\"depa_parent_id\":\"e38abd6e-51b5-4a21-8143-bdae84f39104\",\"departments\":[{\"depa_id\":\"3b7a03a5-8e7e-422b-ae6d-a0367c7629cd\",\"depa_name\":\"技术1部\",\"depa_employees_count\":3,\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\"},{\"depa_id\":\"dc7a2e44-6d25-4069-95a2-4c080fc573b5\",\"depa_name\":\"技术2部\",\"depa_employees_count\":4,\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\"},{\"depa_id\":\"30d59879-b4b6-40f4-8d04-6ee1c31d6ab0\",\"depa_name\":\"技术3部\",\"depa_employees_count\":1,\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\"},{\"depa_id\":\"99badbba-baf8-40ff-a004-31258a48a425\",\"depa_name\":\"技术4部\",\"depa_employees_count\":4,\"depa_parent_id\":\"113d9897-b0f8-4a5a-9bd8-46c8b0abd1f4\",\"departments\":[{\"depa_id\":\"5467a964-7908-4c83-873d-a97bfa1a0582\",\"depa_name\":\"4部1\",\"depa_employees_count\":1,\"depa_parent_id\":\"99badbba-baf8-40ff-a004-31258a48a425\"},{\"depa_id\":\"055358bf-b80c-425c-a8c2-8bba688aeac1\",\"depa_name\":\"4部2\",\"depa_employees_count\":1,\"depa_parent_id\":\"99badbba-baf8-40ff-a004-31258a48a425\"}]}]}],\"msg\":\"success\",\"session_id\":\"769d4c209fa3930a967f3b6d8f4ca98dcc5f7761\"}";
		myBean = new Gson().fromJson(json, MyBean.class);
		traverseDataList(myBean.data, 0);
	}
	private void traverseDataList(List<MyBean.ListBean> departmentList, int parentId) {
		for (int j = 0; j <departmentList.size() ; j++) {
			MyBean.ListBean listBean = departmentList.get(j);
			i++;
			listBean.id = i;
			listBean.parentId = parentId;
			mDepartmentList.add(listBean);
			if (listBean.departments != null && listBean.departments.size() > 0) {
				traverseDataList(listBean.departments, i);
			}
		}
	}

	private void initDatas()
	{



		mDatas.add(new Bean(1, 0, "根目录1"));
		mDatas.add(new Bean(2, 0, "根目录2"));
		mDatas.add(new Bean(3, 0, "根目录3"));
		mDatas.add(new Bean(4, 0, "根目录4"));
		mDatas.add(new Bean(5, 1, "子目录1-1"));
		mDatas.add(new Bean(6, 1, "子目录1-2"));

		mDatas.add(new Bean(7, 5, "子目录1-1-1"));
		mDatas.add(new Bean(8, 2, "子目录2-1"));

		mDatas.add(new Bean(9, 4, "子目录4-1"));
		mDatas.add(new Bean(10, 4, "子目录4-2"));

		mDatas.add(new Bean(11, 10, "子目录4-2-1"));
		mDatas.add(new Bean(12, 10, "子目录4-2-3"));
		mDatas.add(new Bean(13, 10, "子目录4-2-2"));
		mDatas.add(new Bean(14, 9, "子目录4-1-1"));
		mDatas.add(new Bean(15, 9, "子目录4-1-2"));
		mDatas.add(new Bean(16, 9, "子目录4-1-3"));

		mDatas2.add(new FileBean(1, 0, "文件管理系统"));
		mDatas2.add(new FileBean(2, 1, "游戏"));
		mDatas2.add(new FileBean(3, 1, "文档"));
		mDatas2.add(new FileBean(4, 1, "程序"));
		mDatas2.add(new FileBean(5, 2, "war3"));
		mDatas2.add(new FileBean(6, 2, "刀塔传奇"));

		mDatas2.add(new FileBean(7, 4, "面向对象"));
		mDatas2.add(new FileBean(8, 4, "非面向对象"));

		mDatas2.add(new FileBean(9, 7, "C++"));
		mDatas2.add(new FileBean(10, 7, "JAVA"));
		mDatas2.add(new FileBean(11, 7, "Javascript"));
		mDatas2.add(new FileBean(12, 8, "C"));

	}

}
