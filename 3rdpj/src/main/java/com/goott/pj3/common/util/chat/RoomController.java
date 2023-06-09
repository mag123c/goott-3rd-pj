package com.goott.pj3.common.util.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@RequestMapping(value = "/chat")
@Controller
public class RoomController {

    private final ChatRoomRepository repository;

    public RoomController(ChatRoomRepository repository) {
        this.repository = repository;
    }

    //채팅방 목록 조회
    @GetMapping(value = "/rooms")
    public ModelAndView rooms() {
        ModelAndView mv = new ModelAndView("/plan/rooms");
        mv.addObject("list", repository.findAllRooms());
        return mv;
    }

    //채팅방 개설
    @PostMapping(value = "/room")
    public String create(@RequestParam String name, RedirectAttributes rttr) {
        rttr.addFlashAttribute("roomName", repository.createChatRoomDTO(name));
        return "redirect:/chat/rooms";
    }

    //채팅방 조회
    @GetMapping("/room")
    public String getRoom(String roomId, Model model) {
        model.addAttribute("room", repository.findRoomById(roomId));
        return "/plan/room";
    }
}
