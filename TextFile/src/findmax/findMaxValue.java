package findmax;

import java.util.List;

public class findMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\GitHub\\JavaBasic\\TextFile\\src\\findmax\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\GitHub\\JavaBasic\\TextFile\\src\\findmax\\result.txt", maxValue);
        //E:\GitHub\JavaBasic\TextFile\src\findmax\numbers.txt
    }
}
