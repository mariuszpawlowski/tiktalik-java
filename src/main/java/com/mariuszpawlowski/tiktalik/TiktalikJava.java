package com.mariuszpawlowski.tiktalik;

import com.mariuszpawlowski.tiktalik.entity.Image;
import com.mariuszpawlowski.tiktalik.entity.Instance;

import java.util.List;

/**
 * Created by Mariusz.Pawlowski on 2015-11-16.
 */
public interface TiktalikJava {

    List<Instance> getListOfInstances();

    void  createNewInstance(String hostName, String imageUuid, String networkUuid, String instanceSize, String diskSize);

    void deleteInstance(String vpsUuid);

    List<Image> getListOfImages();

    void stopInstance(String vpsUuid);

    Instance getInstance(String vpsUuid);

    void createBackup(String vpsUuid);

    void deleteImage(String image);
}
