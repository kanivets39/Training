import java.util.*;
import javax.swing.*;


public class Nums {
	
	public static void main(String[] args) {
		
		int m = 0;
		//char s = 0;
		Random random = new Random();
		  for (int i = 0; i<10; i++)
		  {
		    m = 1 + random.nextInt(10000 - 1) ;
		  // Nums(m);
		    
		  //  System.out.println(m);
		    System.out.print(m+ " = " +Nums(m));
		  }
		
	}

	@SuppressWarnings("null")
	public static String Nums(int num)
	{
		
		String myStr = new String();
		  int[] x = new int[4]; // массив разрядов
		  int div = 1000; // делитель на разряды
		  int var = num; // частное от деления
		  int rest; // остаток от деления
		  for (int i = 0; i < 4; i++)
		  {
		    rest = var / div;
		    x[i] = rest;
		    var = var - rest*div;
		    div = div / 10;
		  }
		  
		
		  // Тысячи
		  switch (x[0])
		  {
		  
		    case 1: myStr+=(" Одна тысяча "); break;
			case 2: myStr+=(" Две тысячи "); break;
			case 3: myStr+=(" Три тысячи "); break;
			case 4: myStr+=(" Четыре тысячи "); break;
			case 5: myStr+=(" Пять тысяч "); break;
			case 6: myStr+=(" Шесть тысяч "); break;
			case 7: myStr+=(" Семь тысяч "); break;
			case 8: myStr+=(" Восемь тысяч "); break;
			case 9: myStr+=(" Девять тысяч "); break;
		    default: break;
		  }
		
		  // Сотни
		  switch (x[1])
		  {
		  
		    case 1: myStr+=(" Сто "); break;
			case 2: myStr+=(" Двести "); break;
			case 3: myStr+=(" Триста "); break;
			case 4: myStr+=(" Четыреста "); break;
			case 5: myStr+=(" Пятьсот "); break;
			case 6: myStr+=(" Шестьсот"); break;
			case 7: myStr+=(" Семьсот "); break;
		    case 8: myStr+=(" Восемьсот "); break;
		    case 9: myStr+=(" Девятьсот "); break;
		  
		  	default: break;
		  }
		
		  // Десятки
		  switch (x[2])
		  {
		    case 1:
		    // Числа от 10 до 19
		    switch (x[3])
		    {
		    
		    case 0: myStr+=" Десять "; break;
			case 1: myStr+=(" Одиннадцать "); break;
			case 2: myStr+=(" Двенадцать "); break;
			case 3: myStr+=(" Тринадцать "); break;
			case 4: myStr+=(" Четырнадцать "); break;
			case 5: myStr+=(" Пятнадцать "); break;
			case 6: myStr+=(" Шестнадцать"); break;
			case 7: myStr+=(" Семнадцать "); break;
		    case 8: myStr+=(" Восемнадцать "); break;
		    case 9: myStr+=(" Девятнадцать "); break;
		    
		    
		  	}
		    x[3] = 0;
		 
		    break;
		    case 2: myStr+=(" Двадцать "); break;
		    case 3: myStr+=(" Тридцать "); break;
		    case 4: myStr+=(" Сорок "); break;
		    case 5: myStr+=(" Пятьдесят "); break;
		    case 6: myStr+=(" Шестьдесят "); break;
		    case 7: myStr+=(" Семьдесят "); break;
		    case 8: myStr+=(" Восемьдесят "); break;
		    case 9: myStr+=(" Девяносто "); break;
		    default: break;
		  }
		
		  // Единицы
		  switch (x[3]) {
		    case 1: myStr+=(" Один "); break;
		    case 2: myStr+=(" Два "); break;
		    case 3: myStr+=(" Три "); break;
		    case 4: myStr+=(" Четыре "); break;
		    case 5: myStr+=(" Пять "); break;
		    case 6: myStr+=(" Шесть "); break;
		    case 7: myStr+=(" Семь "); break;
		    case 8: myStr+=(" Восемь "); break;
		    case 9: myStr+=(" Девять "); break;
		    default: break;
		  }
		  
		  myStr+= "\n";
		
		return myStr;
		
	}
	
}
