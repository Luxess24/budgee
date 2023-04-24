package dmainmain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;

public class mainmain extends JFrame {

	private JPanel frmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainmain frame = new mainmain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainmain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 697);
		frmMain = new JPanel();
		frmMain.setBackground(new Color(69, 92, 123));
		frmMain.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frmMain);
		
		JLayeredPane layerlayer = new JLayeredPane();
		
		final JPanel rec_panel = new JPanel();
		rec_panel.setBackground(new Color(66, 83, 109));
		rec_panel.setBounds(0, 0, 789, 459);
		rec_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel reclebel = new JLabel("RECORD");
		reclebel.setForeground(new Color(255, 255, 255));
		rec_panel.add(reclebel);
		
		final JPanel analytic_panel = new JPanel();
		analytic_panel.setBackground(new Color(66, 83, 109));
		analytic_panel.setBounds(0, 0, 789, 459);
		analytic_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel anallebel = new JLabel("ANALYTIC");
		anallebel.setForeground(new Color(255, 255, 255));
		analytic_panel.add(anallebel);
		
		final JPanel budget_panel = new JPanel();
		budget_panel.setBackground(new Color(66, 83, 109));
		budget_panel.setBounds(0, 0, 789, 459);
		budget_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel budglebel = new JLabel("BUDGET");
		budglebel.setForeground(new Color(255, 255, 255));
		budget_panel.add(budglebel);
		
		final JPanel acc_panel = new JPanel();
		acc_panel.setBackground(new Color(66, 83, 109));
		acc_panel.setBounds(0, 0, 789, 459);
		acc_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel acclebel = new JLabel("ACCOUNT");
		acclebel.setForeground(new Color(255, 255, 255));
		acc_panel.add(acclebel);
		
		final JPanel categ_panel = new JPanel();
		categ_panel.setBackground(new Color(66, 83, 109));
		categ_panel.setBounds(0, 0, 789, 459);
		categ_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel categlebel = new JLabel("CATEGORY");
		categlebel.setForeground(new Color(255, 255, 255));
		categ_panel.add(categlebel);
		
		JButton rec_button = new JButton("Record");
		rec_button.setFont(new Font("Quicksand Light", Font.BOLD, 15));
		rec_button.setForeground(new Color(252, 187, 109));
		rec_button.setBackground(new Color(85, 111, 146));
		rec_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rec_panel.setVisible(true);
				analytic_panel.setVisible(false);
				budget_panel.setVisible(false);
				acc_panel.setVisible(false);
				categ_panel.setVisible(false);
			}
		});
		rec_button.setFocusable(false);
		
		JButton analytic_button = new JButton("Analytics");
		analytic_button.setFont(new Font("Quicksand Light", Font.BOLD, 15));
		analytic_button.setForeground(new Color(252, 187, 109));
		analytic_button.setBackground(new Color(85, 111, 146));
		analytic_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rec_panel.setVisible(false);
				analytic_panel.setVisible(true);
				budget_panel.setVisible(false);
				acc_panel.setVisible(false);
				categ_panel.setVisible(false);
			}
		});
		analytic_button.setFocusable(false);
		
		JButton budget_button = new JButton("Budget");
		budget_button.setFont(new Font("Quicksand Light", Font.BOLD, 15));
		budget_button.setForeground(new Color(252, 187, 109));
		budget_button.setBackground(new Color(85, 111, 146));
		budget_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rec_panel.setVisible(false);
				analytic_panel.setVisible(false);
				budget_panel.setVisible(true);
				acc_panel.setVisible(false);
				categ_panel.setVisible(false);
			}
		});
		budget_button.setFocusable(false);
		
		JButton acc_button = new JButton("Account");
		acc_button.setFont(new Font("Quicksand Light", Font.BOLD, 15));
		acc_button.setForeground(new Color(252, 187, 109));
		acc_button.setBackground(new Color(85, 111, 146));
		acc_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rec_panel.setVisible(false);
				analytic_panel.setVisible(false);
				budget_panel.setVisible(false);
				acc_panel.setVisible(true);
				categ_panel.setVisible(false);
			}
		});
		acc_button.setFocusable(false);
		
		JButton categ_button = new JButton("Category");
		categ_button.setFont(new Font("Quicksand Light", Font.BOLD, 15));
		categ_button.setForeground(new Color(252, 187, 109));
		categ_button.setBackground(new Color(85, 111, 146));
		categ_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rec_panel.setVisible(false);
				analytic_panel.setVisible(false);
				budget_panel.setVisible(false);
				acc_panel.setVisible(false);
				categ_panel.setVisible(true);
			}
		});
		categ_button.setFocusable(false);
		layerlayer.setLayout(null);
		layerlayer.add(rec_panel);
		layerlayer.add(analytic_panel);
		layerlayer.add(budget_panel);
		layerlayer.add(acc_panel);
		layerlayer.add(categ_panel);
		
		JPanel exint = new JPanel();
		
		JPanel exint_1 = new JPanel();
		GroupLayout gl_frmMain = new GroupLayout(frmMain);
		gl_frmMain.setHorizontalGroup(
			gl_frmMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_frmMain.createSequentialGroup()
					.addGroup(gl_frmMain.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_frmMain.createSequentialGroup()
							.addGap(5)
							.addComponent(exint_1, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(exint, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
						.addGroup(gl_frmMain.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_frmMain.createParallelGroup(Alignment.LEADING)
								.addComponent(rec_button, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(analytic_button, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(budget_button, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(acc_button, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
								.addComponent(categ_button, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
							.addGap(30)
							.addComponent(layerlayer, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)))
					.addGap(5))
		);
		gl_frmMain.setVerticalGroup(
			gl_frmMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_frmMain.createSequentialGroup()
					.addGap(72)
					.addGroup(gl_frmMain.createParallelGroup(Alignment.LEADING)
						.addComponent(exint_1, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
						.addComponent(exint, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
					.addGroup(gl_frmMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_frmMain.createSequentialGroup()
							.addGap(87)
							.addComponent(rec_button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addGap(36)
							.addComponent(analytic_button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addGap(33)
							.addComponent(budget_button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(acc_button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addGap(33)
							.addComponent(categ_button, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addGap(69))
						.addGroup(gl_frmMain.createSequentialGroup()
							.addGap(18)
							.addComponent(layerlayer, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
							.addContainerGap())))
		);
		frmMain.setLayout(gl_frmMain);
	}
}
