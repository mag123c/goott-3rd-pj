package com.goott.pj3.common.util.chat;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

// 2023.04.28 길영준
// 추후 내용 DB저장으로 고도화해야함
@Repository
public class ChatRoomRepository {
    private Map<String, ChatRoomDTO> chatRoomDTOMap;

    @PostConstruct
    private void init() {
        chatRoomDTOMap = new LinkedHashMap<>();
    }

    public List<ChatRoomDTO> findAllRooms() {
        //채팅방 생성 순서 최근 순으로 반환
        List<ChatRoomDTO> result = new ArrayList<>(chatRoomDTOMap.values());
        Collections.reverse(result);

        return result;
    }

    public ChatRoomDTO findRoomById(String id) {
        return chatRoomDTOMap.get(id);
    }

    public ChatRoomDTO createChatRoomDTO(String name) {
        ChatRoomDTO room = ChatRoomDTO.create(name);
        chatRoomDTOMap.put(room.getRoomId(), room);
            // 채팅방이름 uuid부여후 가져오기
            // 채팅방id : 방이름
        return room;
    }
}
