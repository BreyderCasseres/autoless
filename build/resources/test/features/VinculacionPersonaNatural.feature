#Autor: Breyder
#language:en

@VinculacionPN
Feature: Vinculacion persona natural

  @VinculacionPnTodasLasPantallas
  Scenario Outline: Vinculacion persona natural unificada todas las pantallas
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And Ingresa la informacion del ordenante
      | numeroIdentificacionOrdenante   | primerNombreOrdenante   | segundoNombreOrdenante   | primerApellidoOrdenante   | segundoApellidoOrdenante   | fechaExpedicionDocOrdenante   | fechaVigenciaDocOrdenante   | fechaNacimientoOrdenante   | direccionResidenciaOrdenante   | indicativoTelefonoOrdenante   | telefonoOrdenante   | celularOrdenante   | correoOrdenante   | otraOcupacionOrdenante   |
      | <numeroIdentificacionOrdenante> | <primerNombreOrdenante> | <segundoNombreOrdenante> | <primerApellidoOrdenante> | <segundoApellidoOrdenante> | <fechaExpedicionDocOrdenante> | <fechaVigenciaDocOrdenante> | <fechaNacimientoOrdenante> | <direccionResidenciaOrdenante> | <indicativoTelefonoOrdenante> | <telefonoOrdenante> | <celularOrdenante> | <correoOrdenante> | <otraOcupacionOrdenante> |
    And ingresa la informacion del tercero asociado al credito
      | numeroIdentificacionTerceroAsociado   | primerNombreTerceroAsociado   | segundoNombreTerceroAsociado   | primeroApellidoTerceroAsociado   | segundoApellidoTerceroAsociado   | fechaExpedicionDocTerceroAsociado   | fechaNacimientoTerceroAsociado   | direccionResidenciaTerceroAsociado   | indicativoTelefonoTerceroAsociado   | telefonoTerceroAsociado   | celularTerceroAsociado   | correoTerceroAsociado   | otraCualOcupacionTerceroAsociado   |
      | <numeroIdentificacionTerceroAsociado> | <primerNombreTerceroAsociado> | <segundoNombreTerceroAsociado> | <primeroApellidoTerceroAsociado> | <segundoApellidoTerceroAsociado> | <fechaExpedicionDocTerceroAsociado> | <fechaNacimientoTerceroAsociado> | <direccionResidenciaTerceroAsociado> | <indicativoTelefonoTerceroAsociado> | <telefonoTerceroAsociado> | <celularTerceroAsociado> | <correoTerceroAsociado> | <otraCualOcupacionTerceroAsociado> |
    And Ingresa la informacion del beneficiario de garantias bancarias
      | numeroIdentificacionBeneficiarioGarantias   | primerNombreBeneficiarioGarantias   | segundoNombreBeneficiarioGarantias   | primerApellidoBeneficiarioGarantias   | segundoApellidoBeneficiarioGarantias   | fechaExpedicionDocBeneficiarioGarantias   | fechaVigenciaDocBeneficiarioGarantias   |
      | <numeroIdentificacionBeneficiarioGarantias> | <primerNombreBeneficiarioGarantias> | <segundoNombreBeneficiarioGarantias> | <primerApellidoBeneficiarioGarantias> | <segundoApellidoBeneficiarioGarantias> | <fechaExpedicionDocBeneficiarioGarantias> | <fechaVigenciaDocBeneficiarioGarantias> |
    And Ingresa las relaciones bancarias del cliente o tercero
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Selecciona las preguntas de perfil de riesgo
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente y o ordenante
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   | ingresoMensualOrdenante   | otrosIngresosOrdenante   | detalleOtrosIngresosOrdenante   | egresoMensualOrdenante   | activoOrdenante   | pasivoOrdenante   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> | <ingresoMensualOrdenante> | <otrosIngresosOrdenante> | <detalleOtrosIngresosOrdenante> | <egresoMensualOrdenante> | <activoOrdenante> | <pasivoOrdenante> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente           | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante | correoOrdenante   | otraOcupacionOrdenante | numeroIdentificacionTerceroAsociado | primerNombreTerceroAsociado | segundoNombreTerceroAsociado | primeroApellidoTerceroAsociado | segundoApellidoTerceroAsociado | fechaExpedicionDocTerceroAsociado | fechaNacimientoTerceroAsociado | direccionResidenciaTerceroAsociado | indicativoTelefonoTerceroAsociado | telefonoTerceroAsociado | celularTerceroAsociado | correoTerceroAsociado | otraCualOcupacionTerceroAsociado | numeroIdentificacionBeneficiarioGarantias | primerNombreBeneficiarioGarantias | segundoNombreBeneficiarioGarantias | primerApellidoBeneficiarioGarantias | segundoApellidoBeneficiarioGarantias | fechaExpedicionDocBeneficiarioGarantias | fechaVigenciaDocBeneficiarioGarantias | nombrePersonalizado | nombreTitular                  | numeroIdentificacion | numeroDeCuenta | codigoOyd | detalle | otroCual    | observaciones     | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo   | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante | conceptoAml                                        | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente     |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnUnificado@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |11111002220   |Jaime   |Andres   |Mendoza   |Perez   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |PEP   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |10233258552   |Angel   |Raul   |Marquez   |Rodriguez   |Fugas SA   |Tester   |Carrera 11 c   |60   |8855330   |3003668522   |118802   |Detalle   |3225899614   |Prueba   |Prueba gi   |550033997444   |Banco Perú   |44110   |Bancolombia   |99003   |5960034474756   |90632002558   |Calos   |Mario   |Santodomingo   |Mesa   |7852001207   |Jaime   |David   |Soto   |Carvajal   |13/10/1993   |13/10/2050   |15/10/1974   |Calle 88 a # 12 - 99   |60   |4447788   |3008994532   |prueba@prueba.com   |Otra   |11202258855   |Andres   |Mauricio   |Zapata   |Figueroa   |15/07/2015   |7/03/1996   |calle 99 c    |60   |456009   |3106009876   |prueba@prueba.com   |Otra   |96365741100   |Paula   |Andrea   |Torres   |Prado   |10/13/2015   |10/13/2035   |Pedro Ocampo   |Pedro Estiven Ocampo Chavarria   |1140896352   |9077845567433   |99887   |Detalle   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |6000000   |2000000   |Detalle   |3000000   |60000000   |22000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|

  @VinculacionPnSinParticipantes
  Scenario Outline: Vinculacion persona natural unificada sin participantes
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente seleccionado que no depende economicamente de un tercero
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos sin producto garantias bancarias
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos y selecciona que no desea agregar ordenantes
    And Ingresa las relaciones bancarias del cliente
      | nombrePersonalizado   | numeroDeCuenta   |
      | <nombrePersonalizado> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Selecciona las preguntas de perfil de riesgo
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente | correoSecundarioCliente         | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | nombrePersonalizado | numeroDeCuenta | codigoOyd  | detalle | otroCual | observaciones | ingresoMensual    | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo  | pasivo   | conceptoAml | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente                          |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnSinParticipantes@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |1106954586   |Jesus   |Manuel   |Sanchez   |Ortega   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |118802   |Detalle   |3225899614   |Prueba   |Prueba gi   |550033997444   |Banco Perú   |44110   |Bancolombia   |99003   |5960034474756   |Manuela   |2366963200   |99887   |Detalle   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|


  @VinculacionPnSoloBanco
  Scenario Outline: Vinculacion persona natural solo entidad banco
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente seleccionando solo la entidad banco
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos de la entidad banco
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos sin pregunta de ordenante
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And ingresa la informacion del tercero asociado al credito
      | numeroIdentificacionTerceroAsociado   | primerNombreTerceroAsociado   | segundoNombreTerceroAsociado   | primeroApellidoTerceroAsociado   | segundoApellidoTerceroAsociado   | fechaExpedicionDocTerceroAsociado   | fechaNacimientoTerceroAsociado   | direccionResidenciaTerceroAsociado   | indicativoTelefonoTerceroAsociado   | telefonoTerceroAsociado   | celularTerceroAsociado   | correoTerceroAsociado   | otraCualOcupacionTerceroAsociado   |
      | <numeroIdentificacionTerceroAsociado> | <primerNombreTerceroAsociado> | <segundoNombreTerceroAsociado> | <primeroApellidoTerceroAsociado> | <segundoApellidoTerceroAsociado> | <fechaExpedicionDocTerceroAsociado> | <fechaNacimientoTerceroAsociado> | <direccionResidenciaTerceroAsociado> | <indicativoTelefonoTerceroAsociado> | <telefonoTerceroAsociado> | <celularTerceroAsociado> | <correoTerceroAsociado> | <otraCualOcupacionTerceroAsociado> |
    And Ingresa la informacion del beneficiario de garantias bancarias
      | numeroIdentificacionBeneficiarioGarantias   | primerNombreBeneficiarioGarantias   | segundoNombreBeneficiarioGarantias   | primerApellidoBeneficiarioGarantias   | segundoApellidoBeneficiarioGarantias   | fechaExpedicionDocBeneficiarioGarantias   | fechaVigenciaDocBeneficiarioGarantias   |
      | <numeroIdentificacionBeneficiarioGarantias> | <primerNombreBeneficiarioGarantias> | <segundoNombreBeneficiarioGarantias> | <primerApellidoBeneficiarioGarantias> | <segundoApellidoBeneficiarioGarantias> | <fechaExpedicionDocBeneficiarioGarantias> | <fechaVigenciaDocBeneficiarioGarantias> |
    And Ingresa las relaciones bancarias del cliente o tercero entidad solo banco
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente           | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante | correoOrdenante   | otraOcupacionOrdenante | numeroIdentificacionTerceroAsociado | primerNombreTerceroAsociado | segundoNombreTerceroAsociado | primeroApellidoTerceroAsociado | segundoApellidoTerceroAsociado | fechaExpedicionDocTerceroAsociado | fechaNacimientoTerceroAsociado | direccionResidenciaTerceroAsociado | indicativoTelefonoTerceroAsociado | telefonoTerceroAsociado | celularTerceroAsociado | correoTerceroAsociado | otraCualOcupacionTerceroAsociado | numeroIdentificacionBeneficiarioGarantias | primerNombreBeneficiarioGarantias | segundoNombreBeneficiarioGarantias | primerApellidoBeneficiarioGarantias | segundoApellidoBeneficiarioGarantias | fechaExpedicionDocBeneficiarioGarantias | fechaVigenciaDocBeneficiarioGarantias | nombrePersonalizado | nombreTitular                  | numeroIdentificacion | numeroDeCuenta | codigoOyd | detalle | otroCual    | observaciones     | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo   | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante | conceptoAml                                        | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente     |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnSoloBanco@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |102369875   |Adriana   |Isabell   |Medina   |Cardona   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |PEP   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |1187554123   |Jesus   |Andres   |Suarez   |Zapata   |Fugas SA   |Tester   |Carrera 11 c   |60   |8855330   |3003668522   |118802   |Detalle   |3225899614   |Prueba   |Prueba gi   |550033997444   |Banco Perú   |44110   |Bancolombia   |99003   |5960034474756   |502330147986   |Juan   |Pablo   |Castaño   |Flores   |32012202580   |Mario   |Antonio   |Perez   |Perea   |13/10/1993   |13/10/2050   |15/10/1974   |Calle 88 a # 12 - 99   |60   |4447788   |3008994532   |prueba@prueba.com   |Otra   |1023658997   |Maria   |Milena   |Gutierrez   |Sarmiento   |15/07/2015   |7/03/1996   |calle 99 c    |60   |456009   |3106009876   |prueba@prueba.com   |Otra   |22015896530   |Maria   |Camila   |Ortiz   |Soto   |10/13/2015   |10/13/2035   |Pedro Ocampo   |Pedro Estiven Ocampo Chavarria   |1140896352   |9077845567433   |99887   |Detalle   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |6000000   |2000000   |Detalle   |3000000   |60000000   |22000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|

  @VinculacionPnSoloSCB
  Scenario Outline: Vinculacion persona natural solo entidad SCB
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente seleccionando solo la entidad SCB
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos de la entidad SCB
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And Ingresa la informacion del ordenante
      | numeroIdentificacionOrdenante   | primerNombreOrdenante   | segundoNombreOrdenante   | primerApellidoOrdenante   | segundoApellidoOrdenante   | fechaExpedicionDocOrdenante   | fechaVigenciaDocOrdenante   | fechaNacimientoOrdenante   | direccionResidenciaOrdenante   | indicativoTelefonoOrdenante   | telefonoOrdenante   | celularOrdenante   | correoOrdenante   | otraOcupacionOrdenante   |
      | <numeroIdentificacionOrdenante> | <primerNombreOrdenante> | <segundoNombreOrdenante> | <primerApellidoOrdenante> | <segundoApellidoOrdenante> | <fechaExpedicionDocOrdenante> | <fechaVigenciaDocOrdenante> | <fechaNacimientoOrdenante> | <direccionResidenciaOrdenante> | <indicativoTelefonoOrdenante> | <telefonoOrdenante> | <celularOrdenante> | <correoOrdenante> | <otraOcupacionOrdenante> |
    And Ingresa las relaciones bancarias del cliente o tercero solo SCB
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Selecciona las operaciones internaciones
    And Selecciona las preguntas de perfil de riesgo
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente y o ordenante solo entidad SCB
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   | ingresoMensualOrdenante   | otrosIngresosOrdenante   | detalleOtrosIngresosOrdenante   | egresoMensualOrdenante   | activoOrdenante   | pasivoOrdenante   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> | <ingresoMensualOrdenante> | <otrosIngresosOrdenante> | <detalleOtrosIngresosOrdenante> | <egresoMensualOrdenante> | <activoOrdenante> | <pasivoOrdenante> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente           | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante | correoOrdenante   | otraOcupacionOrdenante | nombrePersonalizado | nombreTitular                  | numeroIdentificacion | numeroDeCuenta | codigoOyd | otroCual    | observaciones     | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo   | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante | conceptoAml                                        | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente     |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnSoloSCB@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |10225874136   |Miguel   |Angel   |Medina   |Cano   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |PEP   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |1020336987   |Jesus   |Alberto   |Toro   |Mendoza   |Fugas SA   |Tester   |Carrera 11 c   |60   |8855330   |3003668522   |118802   |Detalle   |3225899614   |Prueba   |Prueba gi   |550033997444   |Banco Perú   |44110   |Bancolombia   |99003   |5960034474756   |8963665874   |Maria   |Camila   |Prado   |Queñodez   |11478520003   |Albeiro   |Antonio   |Gonzales   |Pedraza   |13/10/1993   |13/10/2050   |15/10/1974   |Calle 88 a # 12 - 99   |60   |4447788   |3008994532   |prueba@prueba.com   |Otra   |Pedro Ocampo   |Pedro Estiven Ocampo Chavarria   |1140896352   |9077845567433   |99887   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |6000000   |2000000   |Detalle   |3000000   |60000000   |22000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|


  @VinculacionPnSoloFiduciaria
  Scenario Outline: Vinculacion persona natural solo entidad fiduciaria
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente seleccionando solo la entidad fiduciaria
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos de la entidad fiduciaria
    And Carga los documentos
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And Ingresa la informacion del ordenante
      | numeroIdentificacionOrdenante   | primerNombreOrdenante   | segundoNombreOrdenante   | primerApellidoOrdenante   | segundoApellidoOrdenante   | fechaExpedicionDocOrdenante   | fechaVigenciaDocOrdenante   | fechaNacimientoOrdenante   | direccionResidenciaOrdenante   | indicativoTelefonoOrdenante   | telefonoOrdenante   | celularOrdenante   | correoOrdenante   | otraOcupacionOrdenante   |
      | <numeroIdentificacionOrdenante> | <primerNombreOrdenante> | <segundoNombreOrdenante> | <primerApellidoOrdenante> | <segundoApellidoOrdenante> | <fechaExpedicionDocOrdenante> | <fechaVigenciaDocOrdenante> | <fechaNacimientoOrdenante> | <direccionResidenciaOrdenante> | <indicativoTelefonoOrdenante> | <telefonoOrdenante> | <celularOrdenante> | <correoOrdenante> | <otraOcupacionOrdenante> |
    And Ingresa las relaciones bancarias del cliente o tercero solo SCB
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Selecciona las operaciones internaciones
    And Selecciona las preguntas de perfil de riesgo
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente y o ordenante solo entidad SCB
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   | ingresoMensualOrdenante   | otrosIngresosOrdenante   | detalleOtrosIngresosOrdenante   | egresoMensualOrdenante   | activoOrdenante   | pasivoOrdenante   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> | <ingresoMensualOrdenante> | <otrosIngresosOrdenante> | <detalleOtrosIngresosOrdenante> | <egresoMensualOrdenante> | <activoOrdenante> | <pasivoOrdenante> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente           | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante | correoOrdenante   | otraOcupacionOrdenante | nombrePersonalizado | nombreTitular                  | numeroIdentificacion | numeroDeCuenta | codigoOyd | otroCual    | observaciones     | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo   | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante | conceptoAml                                        | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente     |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnSoloFiduciaria@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |1102658774   |Maicol   |Alejandro   |Chavez   |Orozco   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |PEP   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |1147888209   |Maria   |Milena   |Calle   |Castillo   |Fugas SA   |Tester   |Carrera 11 c   |60   |8855330   |3003668522   |118802   |Detalle   |20258965440   |Jesus   |Manuel   |Mendoza   |Jaramillo   |10230028996   |Damian   |Esteban   |Suarez   |Castro   |13/10/1993   |13/10/2050   |15/10/1974   |Calle 88 a # 12 - 99   |60   |4447788   |3008994532   |prueba@prueba.com   |Otra   |Pedro Ocampo   |Pedro Estiven Ocampo Chavarria   |1140896352   |9077845567433   |99887   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |6000000   |2000000   |Detalle   |3000000   |60000000   |22000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|

  @VinculacionPnMenorDeEdad
  Scenario Outline: Vinculacion persona natural menor de edad
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente menor de edad
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente menor de edad
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And Ingresa la informacion del ordenante
      | numeroIdentificacionOrdenante   | primerNombreOrdenante   | segundoNombreOrdenante   | primerApellidoOrdenante   | segundoApellidoOrdenante   | fechaExpedicionDocOrdenante   | fechaVigenciaDocOrdenante   | fechaNacimientoOrdenante   | direccionResidenciaOrdenante   | indicativoTelefonoOrdenante   | telefonoOrdenante   | celularOrdenante   | correoOrdenante   | otraOcupacionOrdenante   |
      | <numeroIdentificacionOrdenante> | <primerNombreOrdenante> | <segundoNombreOrdenante> | <primerApellidoOrdenante> | <segundoApellidoOrdenante> | <fechaExpedicionDocOrdenante> | <fechaVigenciaDocOrdenante> | <fechaNacimientoOrdenante> | <direccionResidenciaOrdenante> | <indicativoTelefonoOrdenante> | <telefonoOrdenante> | <celularOrdenante> | <correoOrdenante> | <otraOcupacionOrdenante> |
    And ingresa la informacion del tercero asociado al credito
      | numeroIdentificacionTerceroAsociado   | primerNombreTerceroAsociado   | segundoNombreTerceroAsociado   | primeroApellidoTerceroAsociado   | segundoApellidoTerceroAsociado   | fechaExpedicionDocTerceroAsociado   | fechaNacimientoTerceroAsociado   | direccionResidenciaTerceroAsociado   | indicativoTelefonoTerceroAsociado   | telefonoTerceroAsociado   | celularTerceroAsociado   | correoTerceroAsociado   | otraCualOcupacionTerceroAsociado   |
      | <numeroIdentificacionTerceroAsociado> | <primerNombreTerceroAsociado> | <segundoNombreTerceroAsociado> | <primeroApellidoTerceroAsociado> | <segundoApellidoTerceroAsociado> | <fechaExpedicionDocTerceroAsociado> | <fechaNacimientoTerceroAsociado> | <direccionResidenciaTerceroAsociado> | <indicativoTelefonoTerceroAsociado> | <telefonoTerceroAsociado> | <celularTerceroAsociado> | <correoTerceroAsociado> | <otraCualOcupacionTerceroAsociado> |
    And Ingresa la informacion del beneficiario de garantias bancarias
      | numeroIdentificacionBeneficiarioGarantias   | primerNombreBeneficiarioGarantias   | segundoNombreBeneficiarioGarantias   | primerApellidoBeneficiarioGarantias   | segundoApellidoBeneficiarioGarantias   | fechaExpedicionDocBeneficiarioGarantias   | fechaVigenciaDocBeneficiarioGarantias   |
      | <numeroIdentificacionBeneficiarioGarantias> | <primerNombreBeneficiarioGarantias> | <segundoNombreBeneficiarioGarantias> | <primerApellidoBeneficiarioGarantias> | <segundoApellidoBeneficiarioGarantias> | <fechaExpedicionDocBeneficiarioGarantias> | <fechaVigenciaDocBeneficiarioGarantias> |
    And Ingresa las relaciones bancarias del cliente o tercero
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Selecciona las preguntas de perfil de riesgo
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente  menor de edad y o ordenante
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   | ingresoMensualOrdenante   | otrosIngresosOrdenante   | detalleOtrosIngresosOrdenante   | egresoMensualOrdenante   | activoOrdenante   | pasivoOrdenante   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> | <ingresoMensualOrdenante> | <otrosIngresosOrdenante> | <detalleOtrosIngresosOrdenante> | <egresoMensualOrdenante> | <activoOrdenante> | <pasivoOrdenante> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente                  | correoPersonalCliente | correoSecundarioCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante  | correoOrdenante | otraOcupacionOrdenante | numeroIdentificacionTerceroAsociado | primerNombreTerceroAsociado | segundoNombreTerceroAsociado | primeroApellidoTerceroAsociado | segundoApellidoTerceroAsociado | fechaExpedicionDocTerceroAsociado | fechaNacimientoTerceroAsociado | direccionResidenciaTerceroAsociado | indicativoTelefonoTerceroAsociado | telefonoTerceroAsociado | celularTerceroAsociado | correoTerceroAsociado | otraCualOcupacionTerceroAsociado | numeroIdentificacionBeneficiarioGarantias | primerNombreBeneficiarioGarantias | segundoNombreBeneficiarioGarantias | primerApellidoBeneficiarioGarantias | segundoApellidoBeneficiarioGarantias | fechaExpedicionDocBeneficiarioGarantias | fechaVigenciaDocBeneficiarioGarantias | nombrePersonalizado            | nombreTitular | numeroIdentificacion | numeroDeCuenta | codigoOyd | detalle     | otroCual          | observaciones | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo  | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante                                    | conceptoAml                                        | conceptoOficialDeCumplimiento | clienteCreadoExitosamente |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnMenorDeEdad@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |1100222550   |Mariana   |Daniela   |Suarez   |Sanchez   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2005   |14/01/2010   |F   |S   |PEP   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Detalle   |669933   |1120036980   |Jesus   |Manuel   |Restrepo   |Ocampo   |Fugas SA   |Tester   |Carrera 11 c   |60   |8855330   |3003668522   |118802   |Detalle   |3225899614   |Prueba   |Prueba gi   |550033997444   |Banco Perú   |44110   |Bancolombia   |99003   |5960034474756   |4012987566   |Camila   |Andrea   |Gutierrez   |Figueroa   |78852006565   |Daniel   |Alberto   |Cardona   |Aguirre   |13/10/1993   |13/10/2050   |15/10/1974   |Calle 88 a # 12 - 99   |60   |4447788   |3008994532   |prueba@prueba.com   |Otra   |11448742036   |Heidy   |Yulieth   |Hernandez   |Ortiz   |15/07/2015   |7/03/1996   |calle 99 c    |60   |456009   |3106009876   |prueba@prueba.com   |Otra   |96320147855   |Manuel   |Mauricio   |Murcia   |Mendoz   |10/13/2015   |10/13/2035   |Pedro Ocampo   |Pedro Estiven Ocampo Chavarria   |1140896352   |9077845567433   |99887   |Detalle   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |6000000   |2000000   |Detalle   |3000000   |60000000   |22000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|

  @VinculacionPnInversionistaProfesional
  Scenario Outline: Vinculacion persona natural inversionista profesional
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | justifiquePep   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <justifiquePep> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion del tercero
      | numeroIdentificacionTercero   | primerNombreTercero   | segundoNombreTercero   | primerApellidoTercero   | segundoApellidoTercero   | nombreEmpresaTercero   | cargoTercero   | direccionEmpresaTercero   | indicativoTelefonoEmpresaCliente   | telefonoEmpresaTercero   | celularEmpresaTercero   |
      | <numeroIdentificacionTercero> | <primerNombreTercero> | <segundoNombreTercero> | <primerApellidoTercero> | <segundoApellidoTercero> | <nombreEmpresaTercero> | <cargoTercero> | <direccionEmpresaTercero> | <indicativoTelefonoEmpresaCliente> | <telefonoEmpresaTercero> | <celularEmpresaTercero> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos
    And Ingresa la informacion divisas
      | cuentaBancariaNumero   | beneficiarioOTitular   | nombreDelBeneficiarioDeLaCuenta   | numeroDeCuentaDelBeneficiario   | bancoBeneficiario   | codigoSwiftOAba   | bancoIntermediario   | segundoCodigoSwiftOAba   | segundoNumeroDeCuentaDelBeneficiario   |
      | <cuentaBancariaNumero> | <beneficiarioOTitular> | <nombreDelBeneficiarioDeLaCuenta> | <numeroDeCuentaDelBeneficiario> | <bancoBeneficiario> | <codigoSwiftOAba> | <bancoIntermediario> | <segundoCodigoSwiftOAba> | <segundoNumeroDeCuentaDelBeneficiario> |
    And Carga los documentos
    And Ingresa la informacion del vinculo familiar
      | numeroIdentificacionFamiliar   | primerNombreFamiliar   | segundoNombreFamiliar   | primerApellidoFamiliar   | segundoApellidoFamiliar   |
      | <numeroIdentificacionFamiliar> | <primerNombreFamiliar> | <segundoNombreFamiliar> | <primerApellidoFamiliar> | <segundoApellidoFamiliar> |
    And Ingresa la informacion del ordenante
      | numeroIdentificacionOrdenante   | primerNombreOrdenante   | segundoNombreOrdenante   | primerApellidoOrdenante   | segundoApellidoOrdenante   | fechaExpedicionDocOrdenante   | fechaVigenciaDocOrdenante   | fechaNacimientoOrdenante   | direccionResidenciaOrdenante   | indicativoTelefonoOrdenante   | telefonoOrdenante   | celularOrdenante   | correoOrdenante   | otraOcupacionOrdenante   |
      | <numeroIdentificacionOrdenante> | <primerNombreOrdenante> | <segundoNombreOrdenante> | <primerApellidoOrdenante> | <segundoApellidoOrdenante> | <fechaExpedicionDocOrdenante> | <fechaVigenciaDocOrdenante> | <fechaNacimientoOrdenante> | <direccionResidenciaOrdenante> | <indicativoTelefonoOrdenante> | <telefonoOrdenante> | <celularOrdenante> | <correoOrdenante> | <otraOcupacionOrdenante> |
    And ingresa la informacion del tercero asociado al credito
      | numeroIdentificacionTerceroAsociado   | primerNombreTerceroAsociado   | segundoNombreTerceroAsociado   | primeroApellidoTerceroAsociado   | segundoApellidoTerceroAsociado   | fechaExpedicionDocTerceroAsociado   | fechaNacimientoTerceroAsociado   | direccionResidenciaTerceroAsociado   | indicativoTelefonoTerceroAsociado   | telefonoTerceroAsociado   | celularTerceroAsociado   | correoTerceroAsociado   | otraCualOcupacionTerceroAsociado   |
      | <numeroIdentificacionTerceroAsociado> | <primerNombreTerceroAsociado> | <segundoNombreTerceroAsociado> | <primeroApellidoTerceroAsociado> | <segundoApellidoTerceroAsociado> | <fechaExpedicionDocTerceroAsociado> | <fechaNacimientoTerceroAsociado> | <direccionResidenciaTerceroAsociado> | <indicativoTelefonoTerceroAsociado> | <telefonoTerceroAsociado> | <celularTerceroAsociado> | <correoTerceroAsociado> | <otraCualOcupacionTerceroAsociado> |
    And Ingresa la informacion del beneficiario de garantias bancarias
      | numeroIdentificacionBeneficiarioGarantias   | primerNombreBeneficiarioGarantias   | segundoNombreBeneficiarioGarantias   | primerApellidoBeneficiarioGarantias   | segundoApellidoBeneficiarioGarantias   | fechaExpedicionDocBeneficiarioGarantias   | fechaVigenciaDocBeneficiarioGarantias   |
      | <numeroIdentificacionBeneficiarioGarantias> | <primerNombreBeneficiarioGarantias> | <segundoNombreBeneficiarioGarantias> | <primerApellidoBeneficiarioGarantias> | <segundoApellidoBeneficiarioGarantias> | <fechaExpedicionDocBeneficiarioGarantias> | <fechaVigenciaDocBeneficiarioGarantias> |
    And Ingresa las relaciones bancarias del cliente o tercero
      | nombrePersonalizado   | nombreTitular   | numeroIdentificacion   | numeroDeCuenta   |
      | <nombrePersonalizado> | <nombreTitular> | <numeroIdentificacion> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente y o ordenante
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   | ingresoMensualOrdenante   | otrosIngresosOrdenante   | detalleOtrosIngresosOrdenante   | egresoMensualOrdenante   | activoOrdenante   | pasivoOrdenante   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> | <ingresoMensualOrdenante> | <otrosIngresosOrdenante> | <detalleOtrosIngresosOrdenante> | <egresoMensualOrdenante> | <activoOrdenante> | <pasivoOrdenante> |
    And Aprueba los documentos adjuntados
    And Da el concepto aml
      | <conceptoAml> |
    And Da el concepto del oficial de cumplimiento
      | <conceptoOficialDeCumplimiento> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos
    Then visualiza el texto ¡Cliente creado exitosamente!
    Examples:
      | url                                                | usuario  | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | justifiquePep | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente           | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | numeroIdentificacionTercero | primerNombreTercero | segundoNombreTercero | primerApellidoTercero | segundoApellidoTercero | nombreEmpresaTercero | cargoTercero | direccionEmpresaTercero | indicativoTelefonoEmpresaCliente | telefonoEmpresaTercero | celularEmpresaTercero | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin | cuentaBancariaNumero | beneficiarioOTitular | nombreDelBeneficiarioDeLaCuenta | numeroDeCuentaDelBeneficiario | bancoBeneficiario | codigoSwiftOAba | bancoIntermediario | segundoCodigoSwiftOAba | segundoNumeroDeCuentaDelBeneficiario | numeroIdentificacionFamiliar | primerNombreFamiliar | segundoNombreFamiliar | primerApellidoFamiliar | segundoApellidoFamiliar | numeroIdentificacionOrdenante | primerNombreOrdenante | segundoNombreOrdenante | primerApellidoOrdenante | segundoApellidoOrdenante | fechaExpedicionDocOrdenante | fechaVigenciaDocOrdenante | fechaNacimientoOrdenante | direccionResidenciaOrdenante | indicativoTelefonoOrdenante | telefonoOrdenante | celularOrdenante | correoOrdenante   | otraOcupacionOrdenante | numeroIdentificacionTerceroAsociado | primerNombreTerceroAsociado | segundoNombreTerceroAsociado | primeroApellidoTerceroAsociado | segundoApellidoTerceroAsociado | fechaExpedicionDocTerceroAsociado | fechaNacimientoTerceroAsociado | direccionResidenciaTerceroAsociado | indicativoTelefonoTerceroAsociado | telefonoTerceroAsociado | celularTerceroAsociado | correoTerceroAsociado | otraCualOcupacionTerceroAsociado | numeroIdentificacionBeneficiarioGarantias | primerNombreBeneficiarioGarantias | segundoNombreBeneficiarioGarantias | primerApellidoBeneficiarioGarantias | segundoApellidoBeneficiarioGarantias | fechaExpedicionDocBeneficiarioGarantias | fechaVigenciaDocBeneficiarioGarantias | nombrePersonalizado | nombreTitular                  | numeroIdentificacion | numeroDeCuenta | codigoOyd | detalle | otroCual    | observaciones     | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo   | pasivo  | ingresoMensualOrdenante | otrosIngresosOrdenante | detalleOtrosIngresosOrdenante | egresoMensualOrdenante | activoOrdenante | pasivoOrdenante | conceptoAml                                        | conceptoOficialDeCumplimiento                      | clienteCreadoExitosamente     |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionPnInversionistaProfesional@2


  
  @VinculacionReplicacionCore
  Scenario Outline: Vinculacion persona natural replicacion exitosa a los core
    Given Que el usuario ingresa al aplicativo LESS
      | url   |
      | <url> |
    When Ingresa las credenciales de autenticacion
      | usuario   | contrasenia   |
      | <usuario> | <contrasenia> |
    And Ingresa la informacion inicial del cliente
      | numeroIdentificacionCliente   | primerNombreCliente   | segundoNombreCliente   | primerApellidoCliente   | segundoApellidoCliente   |
      | <numeroIdentificacionCliente> | <primerNombreCliente> | <segundoNombreCliente> | <primerApellidoCliente> | <segundoApellidoCliente> |
    And Ingresa la informacion basica del cliente seleccionado que no depende economicamente de un tercero
      | opcionComercial   | opcionTipoEntrevista   | lugarEntrevista   | fechaEntrevista   | horaEntrevista   | grupoEconomicoCliente   | opcionClasificacionCliente   | observacionesEntrevista   | paisExpedicionDocumento   | departamentoExpedicionDocumento   | ciudadExpedicionDocumento   | fechaExpedicionDocCliente   | fechaNacimientoCliente   | generoCliente   | estadoCivilCliente   | direccionResidenciaCliente   | indicativoTelefonoCliente   | telefonoCliente   | celularCliente   | correoPersonalCliente   | correoSecundarioCliente   | nombreEmpresaCliente   | cargoCliente   | paisEmpresa   | departamentoEmpresa   | ciudadEmpresa   | direccionEmpresaCliente   | indicativoEmpresaCliente   | telefonoEmpresaCliente   | detalleRegimenContribuyenteImpuestoSobreRenta   | numeroResolucionAutorretenedorRendimientosFinancieros   |
      | <opcionComercial> | <opcionTipoEntrevista> | <lugarEntrevista> | <fechaEntrevista> | <horaEntrevista> | <grupoEconomicoCliente> | <opcionClasificacionCliente> | <observacionesEntrevista> | <paisExpedicionDocumento> | <departamentoExpedicionDocumento> | <ciudadExpedicionDocumento> | <fechaExpedicionDocCliente> | <fechaNacimientoCliente> | <generoCliente> | <estadoCivilCliente> | <direccionResidenciaCliente> | <indicativoTelefonoCliente> | <telefonoCliente> | <celularCliente> | <correoPersonalCliente> | <correoSecundarioCliente> | <nombreEmpresaCliente> | <cargoCliente> | <paisEmpresa> | <departamentoEmpresa> | <ciudadEmpresa> | <direccionEmpresaCliente> | <indicativoEmpresaCliente> | <telefonoEmpresaCliente> | <detalleRegimenContribuyenteImpuestoSobreRenta> | <numeroResolucionAutorretenedorRendimientosFinancieros> |
    And Ingresa la informacion fatca
      | tinColombia   | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin   |
      | <tinColombia> | <expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin> |
    And Selecciona los productos de replicacion a los core
    And Carga los documentos y selecciona que no desea agregar ordenantes
    And Ingresa las relaciones bancarias del cliente
      | nombrePersonalizado   | numeroDeCuenta   |
      | <nombrePersonalizado> | <numeroDeCuenta> |
    And Ingresa la informacion de pago de dividendos
      | codigoOyd   |
      | <codigoOyd> |
    And Ingresa la informacion de instruccion pago de rendimientos
      | <detalle> |
    And Selecciona las operaciones internaciones
    And Declara el origen de los fondos
      | otroCual   | observaciones   |
      | <otroCual> | <observaciones> |
    And Ingresa la informacion financiera del cliente
      | ingresoMensual   | otrosIngresos   | detalleOtrosIngresos   | egresoMensual   | activo   | pasivo   |
      | <ingresoMensual> | <otrosIngresos> | <detalleOtrosIngresos> | <egresoMensual> | <activo> | <pasivo> |
    And Aprueba los documentos adjuntados
    And Da el | aml sin marcar clasificacion
      | <conceptoAml> |
    And Descarga los formatos y contratos
    And Carga los formatos y contratos para visualizar la replicación
    Then visualiza la replicacion exitosa de los core
    Examples:
      | url | usuario | contrasenia | numeroIdentificacionCliente | primerNombreCliente | segundoNombreCliente | primerApellidoCliente | segundoApellidoCliente | opcionComercial | opcionTipoEntrevista | lugarEntrevista | fechaEntrevista | horaEntrevista | grupoEconomicoCliente | opcionClasificacionCliente | observacionesEntrevista | paisExpedicionDocumento | departamentoExpedicionDocumento | ciudadExpedicionDocumento | fechaExpedicionDocCliente | fechaNacimientoCliente | generoCliente | estadoCivilCliente | direccionResidenciaCliente | indicativoTelefonoCliente | telefonoCliente | celularCliente | correoPersonalCliente | correoSecundarioCliente | nombreEmpresaCliente | cargoCliente | paisEmpresa | departamentoEmpresa | ciudadEmpresa | direccionEmpresaCliente | indicativoEmpresaCliente | telefonoEmpresaCliente | detalleRegimenContribuyenteImpuestoSobreRenta | numeroResolucionAutorretenedorRendimientosFinancieros | tinColombia | expliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin |   nombrePersonalizado | numeroDeCuenta | codigoOyd | detalle | otroCual | observaciones | ingresoMensual | otrosIngresos | detalleOtrosIngresos | egresoMensual | activo | pasivo  | conceptoAml | clienteCreadoExitosamente |
      ##@externaldata@./src/test/resources/datadriven/DataVinculacionPersonaNatural.xlsx@VinculacionReplicacionCore@1
   |https://lesscouat.btgpactual.com.co/portal/#/login   |casserbr   |C4ss3r3s*   |1106954586   |Jesus   |Manuel   |Sanchez   |Ortega   |EGL   |Entrevista   |Lugar prueba    |28/07/2022   |0500p.m.   |Sin grupo económico   |Cliente   |Sin observaciones   |Colombia   |Bogota   |Bogota   |10/02/2015   |14/01/1997   |F   |S   |Calle 77 A   |60   |4321853   |3006226485   |breyder.casseres@btgpactual.com   |prueba2@prueba.com   |Prueba SA   |QA   |Colombia   |Antioquia   |Medellin   |carera 90   |60   |5554020   |Detalle   |669933   |118802   |Detalle   |Manuela   |2366963200   |99887   |Detalle   |Otro origen   |Sin observaciones   |5000000   |1500000   |Detalle   |3900000   |15000000   |8000000   |PositivoPositivoPositivoPositivoPositivoPositivoPo   |¡Cliente creado exitosamente!|
