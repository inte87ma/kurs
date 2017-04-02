package main1; // указывает на то, что класс принадлежит пакету


import java.awt.BorderLayout; // // Импортируем класс, который разделяет окно на Южную,Западную, Северную, Восточную и Центральную области 
import java.awt.EventQueue; // импортируем класс для запуска формы из потока очереди

import javax.swing.JFrame; // Импортируем класс для создания фрейма
import javax.swing.JPanel; // Импортируем класс для создания панели
import javax.swing.border.EmptyBorder; // Импортируем класс для создания пустой рамки, которая позволяет создать отступы вокруг пане

import main1.error; // Импортируем класс с формой об ошибке
import main1.main2; // Импортируем класс с основным меню программы

import javax.swing.JTextArea; // Импортируем класс для текстового поля с возможностью переносить строку
import javax.swing.JLabel; // Импортируем класс для произвольного текста
import javax.swing.JTextField; // Импортируем класс для  текстового поля
import javax.swing.JList; // Импортируем класс для отображения данных в виде списка
import javax.swing.JComboBox; // Импортируем класс выпадающего списка
import javax.swing.DefaultComboBoxModel; //Импортируем класс значения по умолчанию для выпадающего списка
import javax.swing.JRadioButton; // Импортируем класс для чек-бокса(RadioButton)
import javax.swing.JButton; // Импортируем класс для кнопки
import java.awt.Font; // Импортируем класс шрифтов
import java.awt.event.ActionListener; // Импортируем класс-слушатель для передачи информации о событии
import java.awt.event.ActionEvent; // Импортируем класс для обработки нажатий на кнопки
import java.awt.TextField; // Импортируем класс текстовых полей
import javax.swing.JTextPane; // Импортируем класс текстовых панелей
import java.awt.Button; // Импортируем класс кнопок
import java.awt.SystemColor; // Импортируем класс задания системного цвета
import javax.swing.JEditorPane; // Импортируем класс панели
import java.awt.Color; // Импортируем класс задания цвета
import javax.swing.JFormattedTextField; // импортируем класс форматированных полей

public class registration extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { // создаём метод, который будет запускаться
		EventQueue.invokeLater(new Runnable() { // запускаем форму из очереди потоков
			public void run() { // запуск
				try {
					registration frame = new registration(); // создаём переменную типа CreditClassic1
					frame.setVisible(true); // задаём видимость для фрейма
				} catch (Exception e) { // указание на исключение
					e.printStackTrace(); // отображает трассировку стека
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registration () {
		setTitle("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F"); // задаём заголовок для фрейма
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // указываем действие, которое необходимо выполнить когда пользователь закрывает фрейм нажатием на крестик. В данном случае закрыть фрейм
		setBounds(100, 100, 450, 273);  // задаём координаты и размеры панели. В данном случае координаты: 100 по Х и 100 по У координаты самой левой верхней точки компонента; 450 пикселей - ширина 273 высота
		getContentPane().setLayout(null); //  устанавливаем менеджер компоновки
		getContentPane().setLayout(null);//  устанавливаем менеджер компоновки
		
		JTextPane textPane = new JTextPane(); // создаём тесктовую панель
		textPane.setBackground(SystemColor.control); // задаём цвет
		textPane.setText("\u0427\u0442\u043E\u0431\u044B \u0432\u043E\u0439\u0442\u0438 \u0432 \u043B\u0438\u0447\u043D\u044B\u0439 \u043A\u0430\u0431\u0438\u043D\u0435\u0442 \u0434\u043B\u044F \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0432\u0438\u0434\u0435\u043E\u0437\u0430\u043F\u0438\u0441\u0435\u0439 \u0441 \u043A\u0430\u043C\u0435\u0440 \u043D\u0430\u0431\u043B\u044E\u0434\u0435\u043D\u0438\u044F, \u0432\u0432\u0435\u0434\u0438\u0442\u0435 \u043B\u043E\u0433\u0438\u043D \u043F\u0430\u0440\u043E\u043B\u044C"); // задаём текст
		textPane.setBounds(24, 32, 387, 40); // Задаём координаты
		getContentPane().add(textPane); // Добавляем на нашу панель
		
		JTextPane textPane_1 = new JTextPane(); // создаём тесктовую панель
		textPane_1.setBackground(SystemColor.control); // задаём цвет
		textPane_1.setText("\u0415\u0441\u043B\u0438 \u0432\u044B \u0437\u0430\u0431\u044B\u043B\u0438 \u043B\u043E\u0433\u0438\u043D/\u043F\u0430\u0440\u043E\u043B\u044C, \u043E\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044C \u043A \u0430\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440\u0443");// задаём текст
		textPane_1.setBounds(77, 179, 335, 20); // Задаём координаты
		getContentPane().add(textPane_1); // Добавляем на нашу панель
		
		JTextPane textPane_2 = new JTextPane(); // создаём тесктовую панель
		textPane_2.setBackground(SystemColor.control); // задаём цвет
		textPane_2.setText("\u041B\u043E\u0433\u0438\u043D:"); // задаём текст
		textPane_2.setBounds(77, 83, 65, 20); // Задаём координаты
		getContentPane().add(textPane_2); // Добавляем на нашу панель
		
		JTextPane textPane_3 = new JTextPane(); // создаём тесктовую панель
		textPane_3.setText("\u041F\u0430\u0440\u043E\u043B\u044C:"); // задаём текст
		textPane_3.setBackground(SystemColor.menu);// задаём цвет
		textPane_3.setBounds(77, 114, 65, 20); // Задаём координаты
		getContentPane().add(textPane_3); // Добавляем на нашу панель
		
		JFormattedTextField formattedTextField = new JFormattedTextField(); // создаём поле для ввода логина
		formattedTextField.setBounds(152, 83, 106, 20); // Задаём координаты
		getContentPane().add(formattedTextField); // Добавляем на нашу панель
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(); // создаём поле для ввода пароля
		formattedTextField_1.setBounds(152, 114, 106, 20); // Задаём координаты
		getContentPane().add(formattedTextField_1); // Добавляем на нашу панель
		
		JButton btnNewButton_1 = new JButton("\u0412\u043E\u0439\u0442\u0438"); // создаём кнопку для авторизации
		btnNewButton_1.addActionListener(new ActionListener() { // создаём событие на кнопку
			public void actionPerformed(ActionEvent e) {
				int L = 0; // задаём переменную для логина
				int P = 0; // задаём переменную для пароля
				
				L=Integer.parseInt(formattedTextField.getText()); // считываем логин
				P=Integer.parseInt(formattedTextField_1.getText());	// 	считываем пароль
						
				if ((L == 1) && (P == 1)){ // Проверка верности логина и пароля
					main2 nc = new main2(); // в случае совпадения, открываем окно с основным меню программы
					nc.setVisible(true); // задаём видимость
				}else{
				error bc = new error(); // если логин пароль неверные, то выдаём сообщение об ошибке
				bc.setVisible(true);  // задаём видимость
				}
				
			}
		});
		btnNewButton_1.setBounds(162, 145, 89, 23); // Задаём координаты
		getContentPane().add(btnNewButton_1); // Добавляем на нашу панель
	}
}
