App.controller('AgenteCtrl', function($scope, AgenteService, $route){
	$scope.agente = [];
	$scope.notFound = false;
	AgenteService.list().then(function(data){
		$scope.agente = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});

	$scope.deletar = function(id){
		AgenteService.delete(id).then(function(data){
			console.log(data);
			$route.reload();
		});	
	}
//});

//App.controller('EditAgenteCtrl', function($scope, AgenteService, $routeParams, $location){

	//var id = $routeParams.idAgente;
	$scope.atualizar = function(item){
		console.log(item);
		AgenteService.update(item, item.id).then(function(data){
			$location.path('/');
		});
	}
	});	