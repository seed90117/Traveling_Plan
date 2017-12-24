package Interface;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import Values.Value;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Container cp = this.getContentPane();
	
	// Panel
	JPanel inputArea = new JPanel(); // Input Area
	JPanel planArea = new JPanel(); // Input Area
	
	// Label
	JLabel titleLabel = new JLabel(Value.LABEL_MAIN_TITLE); // Main Title
	JLabel inputTitleLabel = new JLabel(Value.LABEL_INPUT_TITLE); // Input Title
	JLabel cityLabel = new JLabel(Value.LABEL_CITY_TITLE); // City Title
	JLabel areaLabel = new JLabel(Value.LABEL_AREA_TITLE); // Area Tilte
	JLabel planListLabel = new JLabel(Value.LABEL_PLAN_TITLE); // Plan List Title
	JLabel labTitleLabel = new JLabel(Value.CCBDA_FULL_NAME); // Lab Full Name
	JLabel labIconLabel = new JLabel(new ImageIcon(this.getClass().getResource("/CCBDA_whiteborder.PNG"))); // Lab Icon
	
	// ComboBox
	JComboBox<String> cityComboBox = new JComboBox<>(); // City Select
	JComboBox<String> areaComboBox = new JComboBox<>(); // Area Select
	
	// List
	JList<String> attractionsList = new JList<>(); // Attractions List
	JList<String> planList = new JList<>(); // Plan List
	
	// Button
	JButton planTravelButton = new JButton(Value.BUTTON_PLAN_TITLE); // Plan Traveling Button
	
	
	MainView() {
		
		DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
		dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
		
		// 視窗設定
		this.setSize(1500, 1020);
		this.setLayout(null);
		this.setTitle("Traveling Plan on Google Map"); // 設定名稱
		this.getContentPane().setBackground(Color.BLACK); // 設定背景顏色
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉選項
		this.setVisible(true); // 設定顯示視窗
		
		// 大標題設定
		titleLabel.setBounds(700, 20, 500, 50);
		titleLabel.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_TITLE));
		titleLabel.setForeground(Color.WHITE);
		
		// 畫板設定
		inputArea.setBounds(20, 70, 340, 360);
		inputArea.setBackground(Color.BLACK);
		inputArea.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
		// 輸入標題設定
		inputTitleLabel.setBounds(150, 70, 100, 40);
		inputTitleLabel.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_MIDDLETITLE));
		inputTitleLabel.setForeground(Color.WHITE);
		
		// 縣市標題設定
		cityLabel.setBounds(40, 120, 50, 30);
		cityLabel.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		cityLabel.setForeground(Color.WHITE);
		
		// 縣市選單設定
		cityComboBox.setBounds(100, 120, 200, 30);
		cityComboBox.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		cityComboBox.setBackground(Color.BLACK);
		cityComboBox.setForeground(Color.WHITE);
		cityComboBox.setRenderer(dlcr); // 設定文字置中
		
		// 區域標題設定
		areaLabel.setBounds(40, 160, 50, 30);
		areaLabel.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		areaLabel.setForeground(Color.WHITE);
		
		// 區域選單設定
		areaComboBox.setBounds(100, 160, 200, 30);
		areaComboBox.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		areaComboBox.setBackground(Color.BLACK);
		areaComboBox.setForeground(Color.WHITE);
		areaComboBox.setRenderer(dlcr); // 設定文字置中
		
		// 景點清單設定
		attractionsList.setBounds(40, 200, 300, 210);
		attractionsList.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		attractionsList.setBackground(Color.BLACK);
		attractionsList.setForeground(Color.WHITE);
		
		// 畫板設定
		planArea.setBounds(20, 440, 340, 450);
		planArea.setBackground(Color.BLACK);
		planArea.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
		// 規劃清單標題設定
		planListLabel.setBounds(130, 440, 120, 40);
		planListLabel.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_MIDDLETITLE));
		planListLabel.setForeground(Color.WHITE);
		
		// 規劃清單設定
		planList.setBounds(40, 490, 300, 390);
		planList.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		planList.setBackground(Color.BLACK);
		planList.setForeground(Color.WHITE);
		
		// 按鈕設定
		planTravelButton.setBounds(20, 910, 340, 50);
		planTravelButton.setFont(new Font(Value.LABEL_FONT_TYPE_CHT, Font.BOLD, Value.FONT_SIZE_SMALLTITLE));
		planTravelButton.setBackground(Color.BLACK);
		planTravelButton.setForeground(Color.WHITE);
		
		// 實驗室名稱
		labTitleLabel.setBounds(750, 910, 380, 50);
		labTitleLabel.setFont(new Font(Value.LABEL_FONT_TYPE_ENG, Font.BOLD, Value.FONT_SIZE_TITLE));
		labTitleLabel.setForeground(Color.WHITE);
		
		// 實驗室LOGO
		labIconLabel.setBounds(1100, 810, 281, 170);
		
		cp.add(titleLabel);
		cp.add(inputTitleLabel);
		cp.add(cityLabel);
		cp.add(areaLabel);
		cp.add(cityComboBox);
		cp.add(areaComboBox);
		cp.add(attractionsList);
		cp.add(planListLabel);
		cp.add(planList);
		cp.add(labTitleLabel);
		cp.add(planTravelButton);
		cp.add(inputArea);
		cp.add(planArea);
	}
	
	public static void main(String[] args) {
		new MainView();
	}

}
