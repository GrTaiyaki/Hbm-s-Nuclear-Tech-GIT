package com.hbm.main;

import com.hbm.lib.RefStrings;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ResourceManager {
	
	////Obj TEs
	
	//Turrets
	public static final IModelCustom turret_heavy_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_heavy_base.obj"));
	public static final IModelCustom turret_heavy_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_heavy_rotor.obj"));

	public static final IModelCustom turret_spitfire_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_spitfire_base.obj"));
	public static final IModelCustom turret_spitfire_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_spitfire_rotor.obj"));
	
	public static final IModelCustom turret_cwis_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cwis_base.obj"));
	public static final IModelCustom turret_cwis_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cwis_rotor.obj"));
	
	public static final IModelCustom turret_cheapo_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_cheapo_base.obj"));
	public static final IModelCustom turret_cheapo_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_cheapo_rotor.obj"));
	
	public static final IModelCustom turret_heavy_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_heavy_gun.obj"));
	public static final IModelCustom turret_rocket_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_rocket_gun.obj"));
	public static final IModelCustom turret_light_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_light_gun.obj"));
	public static final IModelCustom turret_flamer_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_flamer_gun.obj"));
	public static final IModelCustom turret_tau_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_tau_gun.obj"));
	public static final IModelCustom turret_spitfire_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_spitfire_gun.obj"));
	public static final IModelCustom turret_cwis_head = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cwis_head.obj"));
	public static final IModelCustom turret_cwis_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cwis_gun.obj"));
	public static final IModelCustom turret_cheapo_head = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_cheapo_head.obj"));
	public static final IModelCustom turret_cheapo_gun = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turret_cheapo_gun.obj"));
	
	//Pumpjack
	public static final IModelCustom pumpjack_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/pumpjack_base.obj"));
	public static final IModelCustom pumpjack_head = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/pumpjack_head.obj"));
	public static final IModelCustom pumpjack_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/pumpjack_rotor.obj"));
	
	//Turbofan
	public static final IModelCustom turbofan_body = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turbofan_body.obj"));
	public static final IModelCustom turbofan_blades = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/turbofan_blades.obj"));
	
	//Selenium Engine
	public static final IModelCustom selenium_body = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/selenium_engine_body.obj"));
	public static final IModelCustom selenium_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/selenium_engine_rotor.obj"));
	public static final IModelCustom selenium_piston = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/selenium_engine_piston.obj"));
	
	//Press
	public static final IModelCustom press_body = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/press_body.obj"));
	public static final IModelCustom press_head = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/press_head.obj"));
	
	//Anti Mass Spectrometer
	public static final IModelCustom ams_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ams_base.obj"));
	public static final IModelCustom ams_emitter = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ams_emitter.obj"));
	public static final IModelCustom ams_emitter_destroyed = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ams_emitter_destroyed.obj"));
	public static final IModelCustom ams_limiter = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ams_limiter.obj"));
	public static final IModelCustom ams_limiter_destroyed = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ams_limiter_destroyed.obj"));
	
	//Sphere
	public static final IModelCustom sphere_ruv = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sphere_ruv.obj"));
	public static final IModelCustom sphere_iuv = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sphere_iuv.obj"));
	public static final IModelCustom sphere_uv = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sphere_uv.obj"));
	public static final IModelCustom sphere_uv_anim = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sphere_uv.hmf"));
	
	//Radgen
	public static final IModelCustom radgen_body = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/rad_gen_body.obj"));
	public static final IModelCustom radgen_rotor = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/rad_gen_rotor.obj"));
	
	//Small Reactor
	public static final IModelCustom reactor_small_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/reactor_small_base.obj"));
	public static final IModelCustom reactor_small_rods = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/reactor_small_rods.obj"));
	
	//Radar
	public static final IModelCustom radar_body = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/radar_base.obj"));
	public static final IModelCustom radar_head = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/radar_head.obj"));
	
	//Bombs
	public static final IModelCustom bomb_solinium = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/ufp.obj"));
	public static final IModelCustom n2 = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/n2.obj"));
	
	//Cel-Prime
	public static final IModelCustom cp_tower = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cel_prime_tower.obj"));
	public static final IModelCustom cp_terminal = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cel_prime_terminal.obj"));
	public static final IModelCustom cp_battery = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cel_prime_battery.obj"));
	public static final IModelCustom cp_tanks = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cel_prime_tanks.obj"));
	public static final IModelCustom cp_port = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/cel_prime_port.obj"));

	//Satellites
	public static final IModelCustom sat_base = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_base.obj"));
	public static final IModelCustom sat_radar = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_radar.obj"));
	public static final IModelCustom sat_resonator = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_resonator.obj"));
	public static final IModelCustom sat_scanner = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_scanner.obj"));
	public static final IModelCustom sat_mapper = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_mapper.obj"));
	public static final IModelCustom sat_laser = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_laser.obj"));
	public static final IModelCustom sat_foeq = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/sat_foeq.obj"));
	
	////Textures TEs
	
	public static final ResourceLocation universal = new ResourceLocation(RefStrings.MODID, "textures/models/TheGadget3_.png");

	public static final ResourceLocation turret_heavy_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_heavy_base.png");
	
	public static final ResourceLocation turret_heavy_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_heavy_rotor.png");
	public static final ResourceLocation turret_heavy_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_heavy_gun.png");
	public static final ResourceLocation turret_light_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_light_rotor.png");
	public static final ResourceLocation turret_light_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_light_gun.png");
	public static final ResourceLocation turret_rocket_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_rocket_rotor.png");
	public static final ResourceLocation turret_rocket_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_rocket_gun.png");
	public static final ResourceLocation turret_flamer_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_flamer_rotor.png");
	public static final ResourceLocation turret_flamer_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_flamer_gun.png");
	public static final ResourceLocation turret_tau_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_tau_rotor.png");
	public static final ResourceLocation turret_tau_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_tau_gun.png");
	public static final ResourceLocation turret_ciws_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/cwis_base.png");
	public static final ResourceLocation turret_ciws_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/cwis_rotor.png");
	public static final ResourceLocation turret_ciws_head_tex = new ResourceLocation(RefStrings.MODID, "textures/models/cwis_head.png");
	public static final ResourceLocation turret_ciws_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/cwis_gun.png");
	public static final ResourceLocation turret_cheapo_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_cheapo_base.png");
	public static final ResourceLocation turret_cheapo_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_cheapo_rotor.png");
	public static final ResourceLocation turret_cheapo_head_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_cheapo_head.png");
	public static final ResourceLocation turret_cheapo_gun_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turret_cheapo_gun.png");
	
	//Pumpjack
	public static final ResourceLocation pumpjack_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/pumpjack_base.png");
	public static final ResourceLocation pumpjack_head_tex = new ResourceLocation(RefStrings.MODID, "textures/models/pumpjack_head.png");
	public static final ResourceLocation pumpjack_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/pumpjack_rotor.png");
	
	//Pumpjack
	public static final ResourceLocation turbofan_body_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turbofan_body.png");
	public static final ResourceLocation turbofan_blades_tex = new ResourceLocation(RefStrings.MODID, "textures/models/turbofan_blades.png");
	
	//Selenium Engine
	public static final ResourceLocation selenium_body_tex = new ResourceLocation(RefStrings.MODID, "textures/models/selenium_engine_body.png");
	public static final ResourceLocation selenium_piston_tex = new ResourceLocation(RefStrings.MODID, "textures/models/selenium_engine_piston.png");
	public static final ResourceLocation selenium_rotor_tex = new ResourceLocation(RefStrings.MODID, "textures/models/selenium_engine_rotor.png");
	
	//Press
	public static final ResourceLocation press_body_tex = new ResourceLocation(RefStrings.MODID, "textures/models/press_body.png");
	public static final ResourceLocation press_head_tex = new ResourceLocation(RefStrings.MODID, "textures/models/press_head.png");
	
	//Anti Mass Spectrometer
	public static final ResourceLocation ams_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/ams_base.png");
	public static final ResourceLocation ams_emitter_tex = new ResourceLocation(RefStrings.MODID, "textures/models/ams_emitter.png");
	public static final ResourceLocation ams_limiter_tex = new ResourceLocation(RefStrings.MODID, "textures/models/ams_limiter.png");
	public static final ResourceLocation ams_destroyed_tex = new ResourceLocation(RefStrings.MODID, "textures/models/ams_destroyed.png");
	
	//Radgen
	public static final ResourceLocation radgen_body_tex = new ResourceLocation(RefStrings.MODID, "textures/models/rad_gen_body.png");
	
	//Small Reactor
	public static final ResourceLocation reactor_small_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/reactor_small_base.png");
	public static final ResourceLocation reactor_small_rods_tex = new ResourceLocation(RefStrings.MODID, "textures/models/reactor_small_rods.png");
	
	//Radar
	public static final ResourceLocation radar_body_tex = new ResourceLocation(RefStrings.MODID, "textures/models/radar_base.png");
	public static final ResourceLocation radar_head_tex = new ResourceLocation(RefStrings.MODID, "textures/models/radar_head.png");
	
	//Bombs
	public static final ResourceLocation bomb_solinium_tex = new ResourceLocation(RefStrings.MODID, "textures/models/ufp.png");
	public static final ResourceLocation n2_tex = new ResourceLocation(RefStrings.MODID, "textures/models/n2.png");
	
	//Satellites
	public static final ResourceLocation sat_base_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_base.png");
	public static final ResourceLocation sat_radar_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_radar.png");
	public static final ResourceLocation sat_resonator_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_resonator.png");
	public static final ResourceLocation sat_scanner_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_scanner.png");
	public static final ResourceLocation sat_mapper_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_mapper.png");
	public static final ResourceLocation sat_laser_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_laser.png");
	public static final ResourceLocation sat_foeq_tex = new ResourceLocation(RefStrings.MODID, "textures/models/sat_foeq.png");

	
	
	////Obj Items
	
	//Shimmer Sledge
	public static final IModelCustom shimmer_sledge = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/shimmer_sledge.obj"));
	public static final IModelCustom shimmer_axe = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/shimmer_axe.obj"));
	
	////Texture Items

	//Shimmer Sledge
	public static final ResourceLocation shimmer_sledge_tex = new ResourceLocation(RefStrings.MODID, "textures/models/shimmer_sledge.png");
	public static final ResourceLocation shimmer_axe_tex = new ResourceLocation(RefStrings.MODID, "textures/models/shimmer_axe.png");
	
	
	
	////Obj Entities
	
	//Boxcar
	public static final IModelCustom boxcar = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/boxcar.obj"));
	
	//Missiles
	public static final IModelCustom missileV2 = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileV2.obj"));
	public static final IModelCustom missileStrong = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileGeneric.obj"));
	public static final IModelCustom missileHuge = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileHuge.obj"));
	public static final IModelCustom missileNuclear = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileNuclear.obj"));
	public static final IModelCustom missileMIRV = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileMIRV.obj"));
	public static final IModelCustom missileThermo = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileThermo.obj"));
	public static final IModelCustom missileDoomsday = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileDoomsday.obj"));
	public static final IModelCustom missileTaint = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileTaint.obj"));
	public static final IModelCustom missileCarrier = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileCarrier.obj"));
	public static final IModelCustom missileBooster = AdvancedModelLoader.loadModel(new ResourceLocation(RefStrings.MODID, "models/missileBooster.obj"));
	
	////Texture Entities
	
	//Boxcar
	public static final ResourceLocation boxcar_tex = new ResourceLocation(RefStrings.MODID, "textures/models/boxcar.png");
	
	//Missiles
	public static final ResourceLocation missileV2_HE_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileV2_HE.png");
	public static final ResourceLocation missileV2_IN_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileV2_IN.png");
	public static final ResourceLocation missileV2_CL_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileV2_CL.png");
	public static final ResourceLocation missileV2_BU_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileV2_BU.png");
	public static final ResourceLocation missileAA_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileAA.png");
	public static final ResourceLocation missileStrong_HE_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileStrong_HE.png");
	public static final ResourceLocation missileStrong_IN_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileStrong_IN.png");
	public static final ResourceLocation missileStrong_CL_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileStrong_CL.png");
	public static final ResourceLocation missileStrong_BU_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileStrong_BU.png");
	public static final ResourceLocation missileHuge_HE_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileHuge_HE.png");
	public static final ResourceLocation missileHuge_IN_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileHuge_IN.png");
	public static final ResourceLocation missileHuge_CL_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileHuge_CL.png");
	public static final ResourceLocation missileHuge_BU_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileHuge_BU.png");
	public static final ResourceLocation missileNuclear_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileNuclear.png");
	public static final ResourceLocation missileMIRV_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileMIRV.png");
	public static final ResourceLocation missileEndo_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileEndo.png");
	public static final ResourceLocation missileExo_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileExo.png");
	public static final ResourceLocation missileDoomsday_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileDoomsday.png");
	public static final ResourceLocation missileTaint_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileTaint.png");
	public static final ResourceLocation missileMicro_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileMicro.png");
	public static final ResourceLocation missileCarrier_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileCarrier.png");
	public static final ResourceLocation missileBooster_tex = new ResourceLocation(RefStrings.MODID, "textures/models/missileBooster.png");
}
