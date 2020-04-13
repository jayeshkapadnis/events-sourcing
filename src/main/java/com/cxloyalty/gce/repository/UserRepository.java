package com.cxloyalty.gce.repository;

import com.cxloyalty.gce.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository  extends JpaRepository<UserEntity, UUID> {
}
