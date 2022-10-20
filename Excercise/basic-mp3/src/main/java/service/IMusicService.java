package service;

import model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    Music save(Music music);
    Music findById(int id);
    void update(int id, Music music);
    void remove(int id);
}
