package class1025;

import java.util.HashSet;
import java.util.Set;

// Hash Table
// 기본적으로 HashFunction을 받음
public class HashTable {

    private int size = 10000; // 기본 10000을 사용함 -> 메모리 소모가 많이 됨
    private int[] table = new int[size]; // key, value를 저장하기 위한 테이블 생성

    public HashTable() { // size가 없을 경우
    }

    public HashTable(int size) { // size 값을 받는 기본 생성자로 생성
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            int ascii = key.charAt(i);
            asciiSum += ascii;
        }
//        System.out.println("asciiSum : " + asciiSum);
        return asciiSum % size;
    }

    // 데이터 저장하는 함수 -> key, value를 같이 저장
    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(key + " " + hashCode + "번 방에 저장이 완료 되었습니다.");
    }

    // 검색하는 함수 만들기
    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"
        };

        HashTable ht = new HashTable(200);
//        Set<Integer> nameSet = new HashSet<>(); // Set은 다음에 해보기
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));


//            int hashValue = ht.hash(names[i]); // Set
//            System.out.println(hashValue);
//            nameSet.add(hashValue);
        }
        // search 함수를 이용해 Hash 충돌 확인
        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));
//        System.out.printf("%s %s", names.length, nameSet.size());
    }
}

