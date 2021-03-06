package cn.itcast.erp.biz;
import cn.itcast.erp.entity.Returnorders;
/**
 * 退货订单业务逻辑层接口
 * @author Administrator
 *
 */
public interface IReturnordersBiz extends IBaseBiz<Returnorders>{
	
	/**
	 * 审核
	 * @param uuid
	 * @param empuuid
	 */
	void doCheck(Long uuid, Long empuuid);
	
}

