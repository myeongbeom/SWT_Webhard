package com.genergy.webhard.ui;

import java.awt.Color;
import java.awt.Dialog;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;

public class MainUI {
	private Text text;
	private Text text_1;
	private Table table;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainUI window = new MainUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(1252, 890);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Menu menu = new Menu(shell, SWT.BAR);
		
		MenuItem firstMenu = new MenuItem(menu, SWT.CASCADE);
		firstMenu.setText("menu");
		Menu fileMenu = new Menu(shell,SWT.DROP_DOWN);
		firstMenu.setMenu(fileMenu);
		MenuItem find = new MenuItem(fileMenu, SWT.PUSH);
		find.setText("ID/PWD 찾기");
		MenuItem join = new MenuItem(fileMenu,SWT.PUSH);
		join.setText("회원가입");
		MenuItem close = new MenuItem(fileMenu, SWT.PUSH);
		close.setText("close");
		
		//---------------------id/pwd 찾기-------------------------- 
		find.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				UserSearchUI search = new UserSearchUI();
				search.open();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		//---------------------id/pwd 찾기--------------------------
		
		//---------------------회원가입--------------------------
		join.addSelectionListener(new SelectionListener() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				UserJoin join = new UserJoin();
				join.open();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//---------------------회원가입--------------------------
		
		//---------------------닫기--------------------------
		close.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		//---------------------닫기--------------------------		
		shell.setMenuBar(menu);
		
		Composite composite = new Composite(shell, SWT.BORDER);
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBounds(28, 28, 363, 173);
		
		Label lblId = new Label(composite, SWT.NONE);
		lblId.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblId.setBounds(36, 22, 71, 20);
		lblId.setText("ID");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(122, 19, 211, 26);
		
		Label lblPwd = new Label(composite, SWT.NONE);
		lblPwd.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblPwd.setBounds(36, 76, 71, 20);
		lblPwd.setText("PWD");
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(122, 73, 211, 26);
		
		Button btnLogin = new Button(composite, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnLogin.setBounds(36, 119, 297, 37);
		btnLogin.setText("Login");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(418, 227, 788, 569);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnFilename = new TableColumn(table, SWT.NONE);
		tblclmnFilename.setWidth(112);
		tblclmnFilename.setText("이름");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(185);
		tblclmnNewColumn.setText("수정한 날짜");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(107);
		tblclmnNewColumn_1.setText("유형");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(107);
		tblclmnNewColumn_2.setText("크기");
		
		Tree tree = new Tree(shell, SWT.BORDER);
		tree.setBounds(28, 227, 362, 569);

//		text_3 = new Text(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
//		text_3.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL));
//		text_3.setBounds(418, 28, 788, 173);
		JTextArea text_3 = new JTextArea();
		JScrollPane pane = new JScrollPane(text_3);
		pane.setBounds(418,28,788,173);
		String msg ="";
		int pos;
		for(int i=0;i<100;i++){
			msg += i+"번째\n";
			pos = msg.length();
			System.out.println(pos);
			text_3.setText(msg);
		}
		text_3.setEditable(false);
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
