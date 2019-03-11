package com.ruoyi.project.system.product.mapper;


import java.util.List;	

import com.ruoyi.project.system.product.domain.Banner;

/**
 * 广告banner 数据层
 * 
 * @author ruoyi
 * @date 2019-02-27
 */
public interface BannerMapper 
{
	/**
     * 查询广告banner信息
     * 
     * @param id 广告bannerID
     * @return 广告banner信息
     */
	public Banner selectBannerById(Integer id);
	
	/**
     * 查询广告banner列表
     * 
     * @param banner 广告banner信息
     * @return 广告banner集合
     */
	public List<Banner> selectBannerList(Banner banner);
	
	/**
     * 新增广告banner
     * 
     * @param banner 广告banner信息
     * @return 结果
     */
	public int insertBanner(Banner banner);
	
	/**
     * 修改广告banner
     * 
     * @param banner 广告banner信息
     * @return 结果
     */
	public int updateBanner(Banner banner);
	
	/**
     * 删除广告banner
     * 
     * @param id 广告bannerID
     * @return 结果
     */
	public int deleteBannerById(Integer id);
	
	/**
     * 批量删除广告banner
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBannerByIds(String[] ids);
	
}