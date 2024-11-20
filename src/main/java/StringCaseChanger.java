public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                result.append(Character.toLowerCase(text.charAt(i)));
            }
            else if (Character.isLowerCase(text.charAt(i))) {
                result.append(Character.toUpperCase(text.charAt(i)));
            }
            else {
                result.append(text.charAt(i));
            }
        }
        drink.setText(result.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
