package src.main1;

import java.awt.BorderLayout; // // Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
import java.awt.EventQueue; // импортируем класс для запуска формы из потока очереди

import javax.swing.JFrame; // Импортируем класс для создания фрейма
import javax.swing.JPanel; // Импортируем класс для создания панели
import javax.swing.border.EmptyBorder; // Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг панели

import main1.registration; // импортируем класс с формой авторизации

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
import java.awt.SystemColor; // Импортируем класс задания системного цвета
import javax.swing.JEditorPane; // Импортируем класс панели

public class error extends JFrame {

	public error () {
		setTitle("\u041E\u0448\u0438\u0431\u043A\u0430 \u0430\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u0438\r\n"); // задаём заголовок для фрейма
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
		setBounds(100, 100, 450, 160); // Задаём координаты
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		
		JTextPane textPane = new JTextPane(); // создаём текстовую панель
		textPane.setBackground(SystemColor.control); // задаём цвет
		textPane.setText("\u0412\u0432\u0435\u0434\u0451\u043D\u043D\u044B\u0439 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C \u043D\u0435\u0432\u0435\u0440\u043D\u044B\u0435.\r\n\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u0442\u043E \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");  // задаём текст
		textPane.setBounds(24, 37, 387, 40); // Задаём координаты
		getContentPane().add(textPane); // Добавляем на нашу панель
		
		JButton button = new JButton("\u041F\u043E\u043F\u0440\u043E\u0431\u043E\u0432\u0430\u0442\u044C \u0435\u0449\u0451 \u0440\u0430\u0437");  // задаём текст
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // создаём событие при нажатии на кнопку
				registration nc = new registration(); // открываем окно с авторизацией
				nc.setVisible(true); // задаём видимость
			}
		});
		button.setBounds(106, 88, 181, 23); // Задаём координаты
		getContentPane().add(button); // Добавляем на нашу панель
	}
}
