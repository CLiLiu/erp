package cn.itcast.erp.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 报表查询
 *
 */
public interface IReportDao {

	/**
	 * 销售统计
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Map<String,Object>> orderReport(Date startDate, Date endDate);
	
	/**
	 * 销售趋势
	 * @param year
	 * @param month
	 * @return
	 */
	Map<String,Object> trendReport(int year, int month);
	
	/**
	 * 销售退货趋势分析查询
	 * @return
	 */
	List<Map<String, Object>> reportReturn(Date startDate,Date enDate);
	
	
	/**
	 * 获取某年每个月的销售退货趋势
	 * 柱形图
	 * @param year
	 * @param month
	 * @return
	 */
	List<List<?>> trendReportReturn(int year);
	/**
	 * 根据某个商品类型获取该类型商品销售退货情况
	 * @param typeName
	 * @param endTime 
	 * @param startTime 
	 * @return
	 */
	List<Map<String, Object>> orderReport(String typeName, Date startTime, Date endTime);
	
	
	
}
