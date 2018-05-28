You have a list of dishes. Each dish is associated with a list of ingredients used to prepare it. You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list with the first element equal to the name of the ingredient and all of the other elements equal to the names of dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically. The result array should be sorted lexicographically by the names of the ingredients in its elements.

For

  dishes =
  
            [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
  
            ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
            
            ["Quesadilla", "Chicken", "Cheese", "Sauce"],
            
            ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]
            
the output should be

  groupingDishes(dishes) =
                            
            [["Cheese", "Quesadilla", "Sandwich"],
  
            ["Salad", "Salad", "Sandwich"],
                            
            ["Sauce", "Pizza", "Quesadilla", "Salad"],
                            
            ["Tomato", "Pizza", "Salad", "Sandwich"]]
