package testdome.java;

/*

Q. User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits.

Implement the class TextInput that contains:

Public method void add(char c) - adds the given character to the current value
Public method String getValue() - returns the current value
Implement the class NumericInput that:

Inherits from TextInput
Overrides the add method so that each non-numeric character is ignored
For example, the following code should output "10":

Q. 사용자 인터페이스에는 두 가지 유형의 사용자 입력 컨트롤 (모든 문자를 허용하는 TextInput과 숫자 만 허용하는 NumericInput)이 있습니다.

다음을 포함하는 TextInput 클래스를 구현하십시오.

Public 메서드 void add (char c)-주어진 값을 현재 값에 추가합니다. Public 메서드 String getValue ()-현재 값을 반환합니다. NumericInput 클래스를 구현합니다.
TextInput에서 상속 숫자가 아닌 각 문자가 무시되도록 add 메서드를 재정의합니다. 예를 들어 다음 코드는 "10"을 출력해야합니다.

CODE.
    TextInput input = new NumericInput();
    input.add('1');
    input.add('a');
    input.add('0');
    System.out.println(input.getValue());


 */
public class UserInput {


    public static class TextInput{
        String str;

        public TextInput(){
            this.str = "";
        }

        public void add(char c){
            if(c != ' '){
                str += c;
            }
        }

        public String getValue(){
            return this.str;
        }
    }

    public static class NumericInput extends TextInput{

        public NumericInput(){
            super();
        }

        @Override
        public void add(char c) {
            if(Character.isDigit(c)){
                //super.add(ch);
                this.str += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');

        input.add('g');
        input.add('1');
        input.add('w');
        input.add('$');
        input.add('!');
        input.add(';');
        System.out.println(input.getValue());
    }
}