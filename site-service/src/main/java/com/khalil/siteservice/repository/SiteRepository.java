package com.khalil.siteservice.repository;

import java.util.List;

import com.khalil.siteservice.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

	List<Site> findByOrganizationId(Long organizationId);

}
