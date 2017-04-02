package src.main1;

import java.awt.BorderLayout; // // Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
import java.awt.EventQueue; // импортируем класс для запуска формы из потока очереди

import javax.swing.JFrame; // Импортируем класс для создания фрейма
import javax.swing.JPanel; // Импортируем класс для создания панели
import javax.swing.border.EmptyBorder; // Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели


import javax.swing.JTextArea; // Импортируем класс для текстового поля с возможностью переносить строку
import javax.swing.JLabel; // Импортируем класс для произвольного текста
import javax.swing.JTextField; // Импортируем класс для  текстового поля
import javax.swing.JList; // Импортируем класс для отображения данных в виде списка
import javax.swing.JComboBox; // Импортируем класс выпадающего списка
import javax.swing.DefaultComboBoxModel; //Импортируем класс значения по умолчанию для выпадающего списка
import javax.swing.JRadioButton; // Импортируем класс для чек-бокса(RadioButton)
import javax.swing.JButton; // Импортируем класс для кнопки
import java.awt.Font; // Импортируем класс шрифтов
import java.awt.event.ActionListener; // Импортируем класс для обработки нажатий на кнопки
import java.awt.event.ActionEvent; // Импортируем класс для обработки событий
import java.awt.TextField; // Импортируем класс текстовых полей
import javax.swing.JTextPane; // Импортируем класс текстовых панелей
import java.awt.Button; // Импортируем класс кнопок
import java.awt.Color; // Импортируем класс задания цвета
import java.awt.SystemColor; // Импортируем класс задания системного цвета
import javax.swing.SwingConstants; // импортируем класс с константой
import javax.swing.JFormattedTextField;  // импортируем класс форматированных полей

public class physhical extends JFrame {
	private JTextField textField; // задаём переменную для считывания данных
	private JTextField textField_1; // задаём переменную для считывания данных
	private JTextField textField_2; // задаём переменную для считывания данных

	public physhical() {
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F"); // задаём заголовок для фрейма
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
		setBounds(100, 100, 450, 400);  // Задаём координаты
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434");  // задаём текст
		btnNewButton_1.addActionListener(new ActionListener() { // создаём событие при нажатии на кнопку
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //Выход из текущего окна
			}
		});
		btnNewButton_1.setBounds(335, 320, 89, 23); // Задаём координаты
		getContentPane().add(btnNewButton_1); // Добавляем на нашу панель
		
		JTextPane textPane = new JTextPane(); // создаём текстовую панель
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane.setBackground(SystemColor.control);
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F \u0434\u043B\u044F \u0447\u0430\u0441\u0442\u043D\u044B\u0445 \u043A\u043B\u0438\u0435\u043D\u0442\u043E\u0432");  // задаём текст
		textPane.setBounds(10, 11, 414, 43); // Задаём координаты
		getContentPane().add(textPane); // Добавляем на нашу панель
		
		JTextPane textPane_3 = new JTextPane(); // создаём текстовую панель
		textPane_3.setText("\u0412\u0440\u0435\u043C\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u043A\u0430\u043C\u0435\u0440 (\u0447)");  // задаём текст
		textPane_3.setBackground(SystemColor.menu); // задаём цвет
		textPane_3.setBounds(20, 102, 120, 34); // Задаём координаты
		getContentPane().add(textPane_3); // Добавляем на нашу панель
		
		JTextPane textPane_4 = new JTextPane(); // создаём текстовую панель
		textPane_4.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0434\u0430\u043D\u043D\u044B\u0445 (\u043A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u043D\u0435\u0439)");  // задаём текст
		textPane_4.setBackground(SystemColor.menu); // задаём цвет
		textPane_4.setBounds(20, 147, 120, 48); // Задаём координаты
		getContentPane().add(textPane_4); // Добавляем на нашу панель
		
		JTextPane textPane_6 = new JTextPane(); // создаём текстовую панель
		textPane_6.setText("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043A\u0430\u043C\u0435\u0440");  // задаём текст
		textPane_6.setBackground(SystemColor.menu);
		textPane_6.setBounds(20, 206, 120, 34); // Задаём координаты
		getContentPane().add(textPane_6); // Добавляем на нашу панель
		
		JTextPane textPane_7 = new JTextPane(); // создаём текстовую панель
		textPane_7.setText("\u0412\u0430\u043C \u043D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u043E ");  // задаём текст
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_7.setBackground(SystemColor.menu);
		textPane_7.setBounds(20, 286, 110, 23); // Задаём координаты
		getContentPane().add(textPane_7); // Добавляем на нашу панель

		
		JFormattedTextField formattedTextField = new JFormattedTextField(); // создаём поле для вывода результата
		formattedTextField.setEditable(false); // запрещаем его редактирование
		formattedTextField.setText("590");  // задаём текст
		formattedTextField.setBounds(140, 286, 132, 20); // Задаём координаты
		getContentPane().add(formattedTextField); // Добавляем на нашу панель
		
		JTextPane textPane_8 = new JTextPane(); // создаём текстовую панель
		textPane_8.setText("\u0413\u0411 \u043F\u0430\u043C\u044F\u0442\u0438");  // задаём текст
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_8.setBackground(SystemColor.menu); // задаём цвет
		textPane_8.setBounds(282, 286, 76, 23); // Задаём координаты
		getContentPane().add(textPane_8); // Добавляем на нашу панель
		
		JTextPane textPane_1 = new JTextPane(); // создаём текстовую панель
		textPane_1.setText("\u0412\u0440\u0435\u043C\u044F \u0440\u0430\u0431\u043E\u0442\u044B \u043A\u0430\u043C\u0435\u0440 (\u0447)");  // задаём текст
		textPane_1.setBackground(SystemColor.menu); // задаём цвет
		textPane_1.setBounds(20, 52, 120, 34); // Задаём координаты
		getContentPane().add(textPane_1); // Добавляем на нашу панель
		
		JComboBox comboBox = new JComboBox(); // создаём выпадающий список
		comboBox.setEditable(true); // Задаём возможность изменять его пользователю
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Samsung SCU-9051P", "Giraffe GF-D4322HD", "MicroDigital MDC-H6260FTD-24", "Smartec STC-HD3630/3", "AHD Praxis PB-7113AHD 2.8-12"})); // Задаём варианты для выпадающего списка
		comboBox.setBounds(155, 65, 130, 20); // Задаём координаты
		getContentPane().add(comboBox); // Добавляем на нашу панель
		
		textField = new JTextField(); // создаём текстовое поле для ввода данных
		textField.setText("24");  // задаём текст
		textField.setBounds(150, 104, 86, 20); // Задаём координаты
		getContentPane().add(textField); // Добавляем на нашу панель
		textField.setColumns(10);
		
		textField_1 = new JTextField(); // создаём текстовое поле для ввода данных
		textField_1.setText("7");  // задаём текст
		textField_1.setColumns(10); // задаём количество символов
		textField_1.setBounds(150, 147, 86, 20); // Задаём координаты
		getContentPane().add(textField_1); // Добавляем на нашу панель
		
		textField_2 = new JTextField(); // создаём текстовое поле для ввода данных
		textField_2.setText("2");  // задаём текст
		textField_2.setColumns(10); // задаём количество символов
		textField_2.setBounds(150, 198, 86, 20); // Задаём координаты
		getContentPane().add(textField_2); // Добавляем на нашу панель
		
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");  // задаём текст
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double m = 0;
				int t = 0;
				int k = 0;
				int d = 0;
				double V = 0;
				
				int model = comboBox.getSelectedIndex(); //Считываем категории заемщика
				
				switch(model){ // В зависимости от категории заемщика определяем процентную ставку
				case 0: m = 0.5; break; //
				case 1: m = 0.6; break; // 
				case 2: m = 0.8; break; // 
				case 3: m = 1.1; break; // 
				case 4: m = 1.3; break; // 
			}
				t = Integer.parseInt(textField.getText());
				k = Integer.parseInt(textField_1.getText());
				d = Integer.parseInt(textField_2.getText());
				
				V = (m*t*3600*d*k)/1024 ;
				
				V = V * 100; //Округление до сотых
				
				int i = (int) Math.round(V); //Округление до сотых
			 
				V = (double)i / 100; //Округление до сотых
				
				formattedTextField.setText("" + V);  
				
			}
		});
		button.setBounds(125, 240, 120, 23); // Задаём координаты
		getContentPane().add(button); // Добавляем на нашу панель
	}
}
