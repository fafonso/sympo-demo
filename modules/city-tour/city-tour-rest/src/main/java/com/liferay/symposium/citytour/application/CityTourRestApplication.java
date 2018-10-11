package com.liferay.symposium.citytour.application;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.symposium.citytour.model.Subtipo;
import com.liferay.symposium.citytour.model.Tipo;
import com.liferay.symposium.citytour.service.SubtipoLocalService;
import com.liferay.symposium.citytour.service.TipoLocalService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jahedo
 */
@ApplicationPath("/")
@Component(immediate = true, service = Application.class)
public class CityTourRestApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	private Log logger = LogFactoryUtil.getLog(CityTourRestApplication.class.getName());

	@GET
	@Produces("text/plain")
	public String working() {
		return "El servicio esta publicado correctamente.";
	}

	@GET
	@Path("/tipos")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getTipos() {

		int tiposCount = tipoLocalService.getTiposCount();
		List<Tipo> tiposList = tipoLocalService.getTipos(0, tiposCount);
		String result = "[{}]";

		if (!tiposList.isEmpty()) {
			JSONArray listado = JSONFactoryUtil.createJSONArray();
			for (Tipo tipo : tiposList) {
				JSONObject object = JSONFactoryUtil.createJSONObject();
				object.put("label", tipo.getLabel());
				object.put("tipoid", tipo.getTipoId());				
				listado.put(object);
			}

			result = listado.toJSONString();
		}
		return result;

	}

	@GET
	@Path("/tipo/{tipoid}")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getTipo(@PathParam("tipoid") long tipoId) {
		try {
			return JSONFactoryUtil.serialize(tipoLocalService.getTipo(tipoId));
		} catch (Exception e) {
			logger.error(e);
			return "{}";
		}
	}

	@GET
	@Path("/subtipos")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getSubTipos() {
		String result = "";
		int subTiposCount = subtipoLocalService.getSubtiposCount();
		List<Subtipo> subTiposList = subtipoLocalService.getSubtipos(0, subTiposCount);
		if (!subTiposList.isEmpty()) {
			JSONArray listado = JSONFactoryUtil.createJSONArray();
			for (Subtipo subTipo : subTiposList) {
				JSONObject object = JSONFactoryUtil.createJSONObject();
				object.put("label", subTipo.getLabel());
				object.put("subtipoid", subTipo.getSubtipoId());				
				listado.put(object);
			}
			result = listado.toJSONString();
		}
			
		return result;

	}
	
	@GET
	@Path("/subtipos/porid/")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getSubTipoFromTipo(@QueryParam("tipoid") long tipoId) {
		try {
			return JSONFactoryUtil.serialize(subtipoLocalService.getSubtiposFromTipo(tipoId));
		} catch (Exception e) {
			logger.error(e);
			return "{}";
		}
	}	

	@GET
	@Path("/subtipo/{subtipoid}")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getSubTipo(@PathParam("subtipoid") long subTipoId) {
		try {
			return JSONFactoryUtil.serialize(subtipoLocalService.getSubtipo(subTipoId));
		} catch (Exception e) {
			logger.error(e);
			return "{}";
		}
	}	
	
	@Reference
	private TipoLocalService tipoLocalService;

	@Reference
	private SubtipoLocalService subtipoLocalService;
}