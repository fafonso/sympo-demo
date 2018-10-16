<%@ include file="/init.jsp" %>

<portlet:renderURL var="addPromocionURL">
	<portlet:param name="mvcRenderCommandName" value="/citytour/promocion/edit" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>


<liferay-frontend:add-menu>
	<liferay-frontend:add-menu-item title="Promocion" url="${addPromocionURL}" />
</liferay-frontend:add-menu>

<div class="container-fluid-1280">
	<div class="flex-container">
		<liferay-ui:search-container emptyResultsMessage="No hay ninguna promocion." emptyResultsMessageCssClass="taglib-empty-result-message-header-has-plus-btn">
			<liferay-ui:search-container-results results="${Promociones}" />
			<liferay-ui:search-container-row
				className="com.liferay.symposium.citytours.promociones.model.Promocion"
				modelVar="promocion">
				<portlet:renderURL var="editPromocionURL">
						<portlet:param name="mvcRenderCommandName"
							value="/citytour/promocion/edit" />
						<portlet:param name="redirect" value="${currentURL}" />
						<portlet:param name="promocionId" value="${promocion.getPromocionId()}" />
					</portlet:renderURL>

				<liferay-frontend:horizontal-card
                    text="${promocion.getDescripcion()}.  ${promocion.getPrecio()} euros"
                    actionJsp="/promociones/card_actions.jsp"
                    actionJspServletContext="<%= application %>" resultRow="<%=row %>"
                    url="${editPromocionURL}" cssClass="col-12">				  
					<liferay-frontend:horizontal-card-col>
						<clay:label label="${promocion.getUserName()}" style="info" />
					</liferay-frontend:horizontal-card-col>					
                </liferay-frontend:horizontal-card>

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>		
</div>

