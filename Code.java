String[][] groupingDishes(String[][] dishes) {
    TreeMap<String, TreeSet<String>> group = new TreeMap<String, TreeSet<String>>();
    TreeSet<String> disk_list;
    
    for(int i = 0; i< dishes.length; i++)
    {
        for(int d = 1; d <dishes[i].length; d++)
        {
            if(group.containsKey(dishes[i][d]))
            {
                disk_list = group.get(dishes[i][d]);
                disk_list.add(dishes[i][0]);
                group.put(dishes[i][d], disk_list);
            }
            else{
                disk_list = new TreeSet<String>();
                disk_list.add(dishes[i][0]);
                group.put(dishes[i][d],disk_list);
            }
        }
    }
  
    List<String[]> list = new ArrayList<String[]>();
    for(String in : group.keySet())
    {
        int index = 1;
        disk_list = group.get(in);
        if(!(disk_list.size() > 1))
            continue;
        
        String[] ingra = new String[disk_list.size()+1];
        ingra[0] = in;
        for(String ing : disk_list){
            ingra[index++] = ing;
        }
        
        list.add(ingra);
        
    }
    
    String[][] res = new String[list.size()][];
    for(int i = 0; i < list.size(); i++)
    {
        res[i] = list.get(i);
    }

    
    return res;
}
