import java.util.HashMap;
import java.util.Map;

class Solution {
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        Map<Long, Long>map = new HashMap<>(); // X번 방을 가고 싶을 때, 몇 번 방으로 가면 되는지를 담은 map

        for (int i = 0; i < room_number.length; i++) {
            long desireRoomNumber = room_number[i];

            if(!map.containsKey(desireRoomNumber)){ // 가고 싶은 방 번호에 아무도 안왔을 때
                answer[i] = desireRoomNumber; // 그 방 번호를 바로 배정
                map.put(desireRoomNumber, desireRoomNumber+1); // 같은 방에 온 사람은 다음 방으로 보냄
                continue;
            }

            while(true){    // 가고 싶은 방이 이미 배정되어있을 때
                long nextRoom = map.get(desireRoomNumber); // 가야 하는 방 번호를 확인

                if(!map.containsKey(nextRoom)){ // 가야 하는 방에 아무도 배정이 안되어있으면
                    answer[i] = nextRoom; // 방 번호를 배정
                    map.put(room_number[i], nextRoom+1); // 맨 처음 가고자 했던 방 번호를 선택하면 가야 하는 방 다음 방을 선택
                    map.put(nextRoom, nextRoom+1); // 내가 배정 받은 방에 누가 오고 싶으면 다음 방으로 보냄
                    break;
                }
                desireRoomNumber = nextRoom; // 가야 하는 방 마저 누군가에게 배정되어 있다면 
            }
        }
        return answer;
    }
}
