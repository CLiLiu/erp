package cn.itcast.erp.dao.impl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import cn.itcast.erp.dao.IInventoryDao;
import cn.itcast.erp.entity.Inventory;
/**
 * 盘盈盘亏数据访问类
 * @author Administrator
 *
 */
public class InventoryDao extends BaseDao<Inventory> implements IInventoryDao {

	/**
	 * 构建查询条件
	 * @param dep1
	 * @param dep2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(Inventory inventory1,Inventory inventory2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Inventory.class);
		if(inventory1!=null){
			if(null != inventory1.getType() && inventory1.getType().trim().length()>0){
				dc.add(Restrictions.eq("type", inventory1.getType()));
			}
			if(null != inventory1.getState() && inventory1.getState().trim().length()>0){
				dc.add(Restrictions.eq("state", inventory1.getState()));
			}
			if(null != inventory1.getRemark() && inventory1.getRemark().trim().length()>0){
				dc.add(Restrictions.like("remark", inventory1.getRemark(), MatchMode.ANYWHERE));
			}
			if (null != inventory1.getCreatetime()) {
				dc.add(Restrictions.ge("createtime", inventory1.getCreatetime()));
			}
			if (null != inventory1.getChecktime()) {
				dc.add(Restrictions.ge("checktime", inventory1.getChecktime()));
			}

		}
		if (null != inventory2) {
			if (null != inventory2.getCreatetime()) {
				dc.add(Restrictions.le("creatime", inventory2.getCreatetime()));
			}
			if (null != inventory2.getChecktime()) {
				dc.add(Restrictions.le("checktime", inventory2.getChecktime()));
			}
		}
		return dc;
	}

}
