package collect_and_group_cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CollectGroupCards {
	static Scanner sc = null;

	static HashMap<String, ArrayList<Card>> takeInput(HashMap<String, ArrayList<Card>> cards, int key, Card arr[]) {
		ArrayList<Card> list;
		list = new ArrayList<>();

		sc = new Scanner(System.in);
		for (int i = 0; i < key; i++) {
			System.out.println("Enter card " + (i + 1));
			arr[i] = new Card(sc.next(), sc.nextInt());
			list.add(arr[i]);
			cards.put(arr[i].getSymbol(), null);

		}
		for (int i = 0; i < key; i++) {
			cards.put(arr[i].getSymbol(), list);

		}

		return cards;

	}

	static void outputGenerator(HashMap<String, ArrayList<Card>> cards, int size, Card arr[]) {
		Set set = cards.entrySet();
		Iterator i1 = null;
		TreeMap<String, ArrayList<Card>> sorted = new TreeMap<>();
		sorted.putAll(cards);
		System.out.println("Distinct Symbols are : ");
		for (Map.Entry<String, ArrayList<Card>> entry : sorted.entrySet()) {
			System.out.print(entry.getKey() + " ");
		}

		/////////////////////////// print specific/////////////////////////
		ArrayList<Card> list = null;
		i1 = null; 

		for (Map.Entry<String, ArrayList<Card>> entry : sorted.entrySet()) {
			list = new ArrayList<Card>();
			for (int i = 0; i < size; i++) 
			{

				if (entry.getKey().equals(arr[i].getSymbol())) 
				{

					list.add(arr[i]);
				}
				if (i == (size - 1)) {
					int sum = 0;
					System.out.println("\ncards in " + entry.getKey() + " symbol");
					Iterator<Card> i2 = list.iterator();
					while (i2.hasNext()) {
						Card obj = i2.next();
						System.out.println(obj.getSymbol() + " " + obj.getNumber());
						sum += obj.getNumber();
					}
					System.out.println("Number of cards :" + list.size());
					System.out.println("Sum of Numbers :" + sum);
				}

			}
		}

	}

	public static void main(String[] args) {

		HashMap<String, ArrayList<Card>> cards;
		cards = new HashMap<String, ArrayList<Card>>();

		sc = new Scanner(System.in);
		System.out.println("Enter the number of cards : ");
		int numberofCards = sc.nextInt();
		Card arr[] = new Card[numberofCards];

		HashMap<String, ArrayList<Card>> mycollection = null;

		mycollection = takeInput(cards, numberofCards, arr);  

		outputGenerator(mycollection, numberofCards, arr);

	}

}
