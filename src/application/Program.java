package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        //List<Integer> list = new ArrayList<>();
        List<Product> list = new ArrayList<>();
        String path = "/Users/lhserafim/IdeaProjects/GenericsDelimitados-generics/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                //list.add(Integer.parseInt(line));
                String[] fields = line.split(",");
                // Adicionar a lista, instanciando o objeto
                list.add(new Product(fields[0],Double.parseDouble(fields[1]))); // posiçoes 0 e 1 pois tem 2 colunas
                line = br.readLine();
            }
            //Integer x = CalculationService.max(list);
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
