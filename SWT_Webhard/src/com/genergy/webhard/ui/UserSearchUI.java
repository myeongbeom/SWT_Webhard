package com.genergy.webhard.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class UserSearchUI {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UserSearchUI window = new UserSearchUI();
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
		shell.setText("아이디/비밀번호 찾기");
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(621, 361);
		shell.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_2.setLayout(new GridLayout(2, false));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_6 = new Composite(composite_2, SWT.NONE);
		composite_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_6.setLayout(new GridLayout(1, false));
		composite_6.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Label label = new Label(composite_6, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setText("전화번호");
		
		Composite composite_7 = new Composite(composite_2, SWT.NONE);
		composite_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_7.setLayout(new GridLayout(1, false));
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		text = new Text(composite_7, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_8 = new Composite(composite_2, SWT.NONE);
		composite_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_8.setLayout(new GridLayout(1, false));
		composite_8.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Label lblNewLabel = new Label(composite_8, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel.setText("회사명");
		
		Composite composite_9 = new Composite(composite_2, SWT.NONE);
		composite_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_9.setLayout(new GridLayout(1, false));
		composite_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		text_1 = new Text(composite_9, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_3.setLayout(new GridLayout(1, false));
		composite_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_16 = new Composite(composite_3, SWT.NONE);
		composite_16.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_16.setLayout(new GridLayout(1, false));
		composite_16.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, true, true, 1, 1));
		
		Button btnNewButton = new Button(composite_16, SWT.NONE);
		btnNewButton.setText("아이디 찾기");
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_label_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_label_1.widthHint = 590;
		label_1.setLayoutData(gd_label_1);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_1.setLayout(new GridLayout(2, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_4.setLayout(new GridLayout(2, false));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_10 = new Composite(composite_4, SWT.NONE);
		composite_10.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_10.setLayout(new GridLayout(1, false));
		composite_10.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Label lblNewLabel_1 = new Label(composite_10, SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_1.setText("아이디");
		
		Composite composite_11 = new Composite(composite_4, SWT.NONE);
		composite_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_11.setLayout(new GridLayout(1, false));
		composite_11.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		text_2 = new Text(composite_11, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_12 = new Composite(composite_4, SWT.NONE);
		composite_12.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_12.setLayout(new GridLayout(1, false));
		composite_12.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite_12, SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_2.setText("전화번호");
		
		Composite composite_13 = new Composite(composite_4, SWT.NONE);
		composite_13.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_13.setLayout(new GridLayout(1, false));
		composite_13.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		text_3 = new Text(composite_13, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_14 = new Composite(composite_4, SWT.NONE);
		composite_14.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_14.setLayout(new GridLayout(1, false));
		composite_14.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Label lblNewLabel_3 = new Label(composite_14, SWT.NONE);
		lblNewLabel_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_3.setText("회사명");
		
		Composite composite_15 = new Composite(composite_4, SWT.NONE);
		composite_15.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_15.setLayout(new GridLayout(1, false));
		composite_15.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		text_4 = new Text(composite_15, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_5 = new Composite(composite_1, SWT.NONE);
		composite_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_5.setLayout(new GridLayout(1, false));
		composite_5.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		
		Composite composite_17 = new Composite(composite_5, SWT.NONE);
		composite_17.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_17.setLayout(new GridLayout(1, false));
		composite_17.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, true, true, 1, 1));
		
		Button btnNewButton_1 = new Button(composite_17, SWT.NONE);
		btnNewButton_1.setText("비밀번호 찾기");
		

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
