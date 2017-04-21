package com.zhy.tree_view;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

public class SimpleTreeAdapter<T> extends TreeListViewAdapter<T>
{
	private List<T> mDatas;
	protected int selectPosition = -2;
	private OnTreeNodeSelectListener onTreeNodeSelectListener;


	public SimpleTreeAdapter(ListView mTree, Context context, List<T> datas,
			int defaultExpandLevel) throws IllegalArgumentException,
			IllegalAccessException
	{
		super(mTree, context, datas, defaultExpandLevel);
		mDatas = datas;
	}

	public T getSelectData() {
		if (selectPosition >= 0) {
			return mDatas.get(selectPosition);
		}
		return null;
	}


	@Override
	public View getConvertView(final Node node , final int position, View convertView, ViewGroup parent)
	{
		
		ViewHolder viewHolder = null;
		if (convertView == null)
		{
			convertView = mInflater.inflate(R.layout.list_item, parent, false);
			viewHolder = new ViewHolder();
			viewHolder.icon = (ImageView) convertView
					.findViewById(R.id.id_treenode_icon);
			viewHolder.label = (TextView) convertView
					.findViewById(R.id.id_treenode_label);
			viewHolder.isSelect = (ImageView) convertView
					.findViewById(R.id.iv_select);
			convertView.setTag(viewHolder);

		} else
		{
			viewHolder = (ViewHolder) convertView.getTag();
		}

		if (node.getIcon() == -1)
		{
			viewHolder.icon.setVisibility(View.INVISIBLE);
		} else
		{
			viewHolder.icon.setVisibility(View.VISIBLE);
			viewHolder.icon.setImageResource(node.getIcon());
		}

		viewHolder.label.setText(node.getName());

		viewHolder.isSelect.setSelected(node.getIsSelect() == 1);
		viewHolder.isSelect.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (node.getIsSelect() == 0) {
					node.setIsSelect(1);
					if (selectPosition >= 0) {
						mAllNodes.get(selectPosition).setIsSelect(0);
					} else {
						if (onTreeNodeSelectListener != null) {
							onTreeNodeSelectListener.onTreeNodeSelect();
						}
					}
					setSelectPosition(position);
				}
			}
		});
		return convertView;
	}

	private final class ViewHolder
	{
		ImageView icon;
		TextView label;
		ImageView isSelect;
	}

	public void unSelectNode(int position) {
		mAllNodes.get(position).setIsSelect(0);
		notifyDataSetChanged();
	}

	public int getSelectPosition() {
		return selectPosition;
	}

	public void setSelectPosition(int selectPosition) {
		this.selectPosition = selectPosition;
		notifyDataSetChanged();
	}

	public interface OnTreeNodeSelectListener {
		void onTreeNodeSelect();
	}

	public void setOnTreeNodeSelectListener(OnTreeNodeSelectListener onTreeNodeSelectListener) {
		this.onTreeNodeSelectListener = onTreeNodeSelectListener;
	}

}
