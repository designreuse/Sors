package com.jubaka.sors.tcpAnalyse.httpView;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;


public class HTTPTreeView extends JPanel {
/*
	
	public HTTPTreeView(Session ses) {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		
		MyNode top = new MyNode(new JPanel());
		DefaultTreeModel model = new DefaultTreeModel(top);
		for (HTTP http : ses.getHTTPList()) {
			HTTPPanelHead pHead = new HTTPPanelHead(http);
			HTTPPanelBody pBody = new HTTPPanelBody(http);
			MyNode nodeHead = new MyNode(pHead);
			MyNode nodeBody = new MyNode(pBody);
			nodeHead.add(nodeBody);
			top.add(nodeHead);
		}
		JTree tree = new JTree(model);
		tree.setLargeModel(true);
		scrollPane.setViewportView(tree);
		tree.setCellRenderer(new MyRenderer());
		tree.setRootVisible(false);
		scrollPane.setViewportView(tree);
	}
	*/
}

class MyNode extends DefaultMutableTreeNode {
	
	public MyNode(Object userobject) {
		super(userobject);
	}
	public Object getUserObject() {
		return userObject;
	}
}

class MyRenderer implements TreeCellRenderer {

	@Override
	public Component getTreeCellRendererComponent(JTree arg0, Object arg1,
			boolean arg2, boolean arg3, boolean arg4, int arg5, boolean arg6) {
		DefaultMutableTreeNode  node = (DefaultMutableTreeNode) arg1;
	//	if (node.getUserObject() instanceof Component)
			System.out.println("comp " +node.getUserObject());
		return (Component)node.getUserObject();
	//return new SettingsListItem("Security");
	}
	
}
