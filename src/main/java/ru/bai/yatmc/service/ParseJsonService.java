package ru.bai.yatmc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.bai.yatmc.model.DndCharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ParseJsonService {
    ObjectMapper objectMapper = new ObjectMapper();

    public ParseJsonService() {
    }

    public HashMap<String, Object> jsonStringToObject(String responce) throws JsonProcessingException {

        TypeReference<ArrayList<HashMap<String, Object>>> typeRef
                = new TypeReference<ArrayList<HashMap<String, Object>>>() {
        };

        ArrayList<HashMap<String, Object>> characterMap = objectMapper.readValue(responce, typeRef);

        return characterMap.get(0);// Возвращает всю мапу целиком(нужна сортировка для нескольких значений)
    }

    public Object jsonParseByKey(String responce, String key) throws JsonProcessingException {
        TypeReference<ArrayList<HashMap<String, Object>>> typeRef
                = new TypeReference<ArrayList<HashMap<String, Object>>>() {
        };

        ArrayList<HashMap<String, Object>> characterMap = objectMapper.readValue(responce, typeRef);
        return characterMap.get(0).get(key); //Возвращает строку из мапы по ключу
    }


    public ArrayList jsonParseToArray(String response) throws JsonProcessingException {
        TypeReference<ArrayList<HashMap<String, Object>>> typeRef
                = new TypeReference<ArrayList<HashMap<String, Object>>>() {
        };
        ArrayList<HashMap<String, Object>> characterMap = objectMapper.readValue(response, typeRef);
        return characterMap;
    }
    public ArrayList<DndCharacter> jsonParseToCharacterList (String response) throws JsonProcessingException {
        ArrayList<DndCharacter> characterList = objectMapper.readValue(response, new TypeReference<ArrayList<DndCharacter>>(){});
        return characterList;
    }


}
