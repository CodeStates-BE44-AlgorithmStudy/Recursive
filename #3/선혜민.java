package problem3;

import java.util.HashMap;
public class SolutionHM {
    HashMap <Long, Long> map = new HashMap<>();
    public long[] solution (long k, long[] roomNum) {  // 총 방 갯수 : K / 방 번호 : roomNum
        long[] your_room = new long[roomNum.length];

        for(int i = 0; i < roomNum.length; i++){
            your_room [i] = find_room(roomNum[i]); // 해당 방 번호가 배정된 방 번호를 반환받 저장
        }
        return your_room;
    }

    long find_room (long wantRoom ){ // 요청한, 원하는 방
        if(!map.containsKey(wantRoom)){ // 원하는 방이 비어있을때

            // 선언한 hashmap에 첫번째 room 번호와 다음 room과 연결한다.(배정받을 수 있는 방을 미리 찾도록)
            // wantRoom 이 map의 키로 사용되어 다음 배정될 방을 계산 후 저장 그렇기에 +1
            map.put(wantRoom, wantRoom+1);

            return wantRoom;
        }
        long next_room = map.get(wantRoom); // map에서 wantRoom을 키로 다음으로 배정될 방 번호를 가져온다
        long empty_room = find_room(next_room); // 재귀함수 사용하여 nextroom에서 비어있는 방을 찾아 할당
        map.put(wantRoom, empty_room); // 전에 반환된 방 번호 = 키 / 찾은 비어있는 방의 번호 값을 반환
        return empty_room; // 비어있는 방 반환.
    }
}
