package src.main1;

import java.awt.BorderLayout; // // Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
import java.awt.EventQueue; // импортируем класс для запуска формы из потока очереди

import javax.swing.JFrame; // Импортируем класс для создания фрейма
import javax.swing.JPanel; // Импортируем класс для создания панели
import javax.swing.border.EmptyBorder; // Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели

import main1.physhical; // импортируем класс с калькулятором для частных лиц
import main1.korporate; // импортируем класс с калькулятором для корпоративных клиентов

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
import java.awt.SystemColor;  // Импортируем класс задания системного цвета

public class main2 extends JFrame {

	public main2() {
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F"); // задаём заголовок для фрейма
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
		setBounds(100, 100, 450, 260); // Задаём координаты
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		
		JTextPane txtpnDsthbnt = new JTextPane(); // создаём тесктовую панель
		txtpnDsthbnt.setBackground(SystemColor.control); // задаём цвет
		txtpnDsthbnt.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtpnDsthbnt.setText("\u0412\u044B\u0431\u0435\u0440\u0438\u0442\u0435 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F"); // задаём текст
		txtpnDsthbnt.setBounds(74, 31, 302, 38); // Задаём координаты
		getContentPane().add(txtpnDsthbnt); // Добавляем на нашу панель
		
		JButton btnNewButton = new JButton("\u041A\u043E\u0440\u043F\u043E\u0440\u0430\u0442\u0438\u0432\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");// задаём текст
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				korporate nc = new korporate(); // Событие при нажатии на кнопку
				nc.setVisible(true); // задаём видимость
			}
		});
		btnNewButton.setBounds(25, 97, 196, 38); // Задаём координаты
		getContentPane().add(btnNewButton); // Добавляем на нашу панель
		
		JButton button = new JButton("\u0427\u0430\u0441\u0442\u043D\u044B\u0439 \u043A\u043B\u0438\u0435\u043D\u0442");// задаём текст
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				physhical bc = new physhical(); // Событие при нажатии на кнопку
				bc.setVisible(true); // задаём видимость
			}
		});
		button.setBounds(228, 97, 196, 38); // Задаём координаты
		getContentPane().add(button); // Добавляем на нашу панель
		
		JButton btnNewButton_1 = new JButton("\u0412\u044B\u0445\u043E\u0434");// задаём текст
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //Выход из текущего окна
			}
		});
		btnNewButton_1.setBounds(335, 188, 89, 23); // Задаём координаты
		getContentPane().add(btnNewButton_1); // Добавляем на нашу панель
	}
}
