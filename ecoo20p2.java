import java.util.*;
@SuppressWarnings("resource")

public class ecoo20p2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        for(int t = 0; t < tests; t++){
            int stores = sc.nextInt();
            HashMap<String, ArrayList<Store>> map = new HashMap<>();
            for(int j = 0; j < stores; j++){
                int items = sc.nextInt();

                for(int i = 0; i < items; i++){
                    String itemName = sc.next();
                    Store s = new Store();
                    s.price = sc.nextInt();
                    s.quantity = sc.nextInt();

                    if(!map.containsKey(itemName)){
                        map.put(itemName, new ArrayList<>());
                    }
                    int w = 0;
                    while( w < map.get(itemName).size() && map.get(itemName).get(w).price < s.price){
                        w++;
                    }
                    map.get(itemName).add(w, s);
                }
            }
            int k = sc.nextInt();
            int sum = 0;

            for(int c = 0; c < k; c++){
                String item = sc.next();
                int amt = sc.nextInt();

                for(int zz = 0; zz < map.get(item).size() && amt != 0; zz++){
                    int quant = map.get(item).get(zz).quantity;
                    int pri = map.get(item).get(zz).price;
                    if(amt >= quant){
                        amt -= quant;
                        sum += quant*pri;
                    }else{
                        sum += amt*pri;
                        amt = 0;
                    }
                }
            }
            System.out.println(sum);
        }
    }

    public static class Store{
        int quantity;
        int price;
    }
}