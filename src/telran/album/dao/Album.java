package telran.album.dao;

import telran.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId,int albumId);
    boolean updatePhoto(int photoId,int albumId,String url);
    Photo getPhotoFromAlbum(int photo,int id);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
