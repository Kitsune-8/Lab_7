// my ex 6
import java.util.Scanner;
class File{
    private String name;
    private long fileSize; // Размер в байтах
    private String creationDate;
    private int accessCount;

    public File(String name, long fileSize, String creationDate, int accessCount) {
        this.name = name;
        this.fileSize = fileSize;
        this.creationDate = creationDate;
        this.accessCount = accessCount;
    }
    public String getName() {
        return name;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public int getAccessCount() {
        return accessCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        File[] files = new File[5];
        files[0] = new File("f1.txt", 150, "08.11.2023", 22);
        files[1] = new File("f2.txt", 254, "13.12.2024", 18);
        files[2] = new File("f3.txt", 215, "10.09.2024", 9);
        files[3] = new File("f4.txt", 365, "01.02.2025", 17);
        files[4] = new File("f5.txt", 987, "08.08.2024", 14);

        System.out.print("Введите максимальный размер файла: ");
        long size = in.nextLong();
        int count = 0;
        System.out.println("Файлы, размер которых превышает " + size + " байт:");
        for (File file : files) {
            if (file.getFileSize() > size) {
                System.out.println(file.getName() + " - " + file.getFileSize() + " байт");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Файлы, превышающие заданный размер, отсутствуют.");
        }

        System.out.print("Введите количество обращений: ");
        int count1 = in.nextInt();
        int countAccess = 0; // для подсчёта количества ообращений
        System.out.println("Файлы, количество обращений к которым превышает " + count1 + ":");
        for (File file : files) {
            if (file.getAccessCount() > count1) {
                System.out.println(file.getName() + " - " + file.getAccessCount() + " обращений(я)");
                countAccess++;
            }
        }
        if (countAccess == 0) {
            System.out.println("Файлы с превышенным количеством обращений отсутствуют.");
        }
    }
}