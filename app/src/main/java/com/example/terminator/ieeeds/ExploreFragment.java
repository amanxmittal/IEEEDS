package com.example.terminator.ieeeds;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {


    Button buttonSocietyLink, buttonExploreBack;
    CardView cvSocietyDetail, cvSociety1, cvSociety2, cvSociety3, cvSociety4, cvSociety5, cvSociety6, cvSociety7, cvSociety8, cvSociety9, cvSociety10, cvSociety11;
    CardView cvSociety12, cvSociety13, cvSociety14, cvSociety15, cvSociety16, cvSociety17, cvSociety18, cvSociety19, cvSociety20, cvSociety21;

    ImageView ivLogoDetail;
    TextView tvHeadDetail, tvDescDetail;
    String societyLink;

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        buttonSocietyLink = (Button) view.findViewById(R.id.buttonSocietyLink);
        buttonExploreBack = (Button) view.findViewById(R.id.buttonExploreBack);

        ivLogoDetail = (ImageView) view.findViewById(R.id.ivEvent1);
        tvHeadDetail = (TextView) view.findViewById(R.id.tvEventTitle1);
        tvDescDetail = (TextView) view.findViewById(R.id.tvEventDesc);

        cvSocietyDetail = (CardView) view.findViewById(R.id.cvSocietyDetail);
        cvSociety1 = (CardView) view.findViewById(R.id.cvSociety1);
        cvSociety2 = (CardView) view.findViewById(R.id.cvSociety2);
        cvSociety3 = (CardView) view.findViewById(R.id.cvSociety3);
        cvSociety4 = (CardView) view.findViewById(R.id.cvSociety4);
        cvSociety5 = (CardView) view.findViewById(R.id.cvSociety5);
        cvSociety6 = (CardView) view.findViewById(R.id.cvSociety6);
        cvSociety7 = (CardView) view.findViewById(R.id.cvSociety7);
        cvSociety8 = (CardView) view.findViewById(R.id.cvSociety8);
        cvSociety9 = (CardView) view.findViewById(R.id.cvSociety9);

        cvSociety10 = (CardView) view.findViewById(R.id.cvSociety10);
        cvSociety11 = (CardView) view.findViewById(R.id.cvSociety11);
        cvSociety12 = (CardView) view.findViewById(R.id.cvSociety12);
        cvSociety13 = (CardView) view.findViewById(R.id.cvSociety13);
        cvSociety14 = (CardView) view.findViewById(R.id.cvSociety14);
        cvSociety15 = (CardView) view.findViewById(R.id.cvSociety15);
        cvSociety16 = (CardView) view.findViewById(R.id.cvSociety16);
        cvSociety17 = (CardView) view.findViewById(R.id.cvSociety17);
        cvSociety18 = (CardView) view.findViewById(R.id.cvSociety18);
        cvSociety19 = (CardView) view.findViewById(R.id.cvSociety19);
        cvSociety20 = (CardView) view.findViewById(R.id.cvSociety20);
        cvSociety21 = (CardView) view.findViewById(R.id.cvSociety21);


        buttonSocietyLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse(societyLink+""); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getActivity(),"link button pressed",Toast.LENGTH_SHORT).show();
            }
        });

        buttonExploreBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSocietyDetail);
            }
        });

        cvSociety1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety1);
            }
        });

        cvSociety2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety2);
            }
        });

        cvSociety3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety3);
            }
        });

        cvSociety4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety4);
            }
        });

        cvSociety5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety5);
            }
        });

        cvSociety6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety6);
            }
        });

        cvSociety7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety7);
            }
        });

        cvSociety8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety8);
            }
        });

        cvSociety9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety9);
            }
        });

        cvSociety10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety10);
            }
        });

        cvSociety11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety11);
            }
        });

        cvSociety12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety12);
            }
        });

        cvSociety13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety13);
            }
        });

        cvSociety14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety14);
            }
        });

        cvSociety15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety15);
            }
        });

        cvSociety16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety16);
            }
        });

        cvSociety17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety17);
            }
        });

        cvSociety18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety18);
            }
        });

        cvSociety19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety19);
            }
        });

        cvSociety20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety20);
            }
        });

        cvSociety21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCard(cvSociety21);
            }
        });


        return view;


    }

    public void setCard(CardView cardView){

        switch (cardView.getId())
        {
            case R.id.cvSocietyDetail :

                setCardVisible();
                cvSocietyDetail.setVisibility(View.GONE);

                break;

            case R.id.cvSociety1 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.circuits_and_systems_society));
                tvDescDetail.setText(getResources().getString(R.string.circuits_and_systems_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i1));
                societyLink = "http://ieee-cas.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety2 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.computer_society));
                tvDescDetail.setText(getResources().getString(R.string.computer_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i2));
                societyLink = "https://www.computer.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety3 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.power_and_energy_society));
                tvDescDetail.setText(getResources().getString(R.string.power_and_energy_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i3));
                societyLink = "https://www.ieee-pes.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety4 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.industry_applications_society));
                tvDescDetail.setText(getResources().getString(R.string.industry_applications_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i4));
                societyLink = "https://ias.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety5 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.communications_society));
                tvDescDetail.setText(getResources().getString(R.string.communications_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i5));
                societyLink = "https://www.comsoc.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety6 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.technology_and_engineering_management_society));
                tvDescDetail.setText(getResources().getString(R.string.technology_and_engineering_management_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i6));
                societyLink = "http://www.ieee-tems.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety7 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.instrumentation_and_measurement_society));
                tvDescDetail.setText(getResources().getString(R.string.instrumentation_and_measurement_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i7));
                societyLink = "http://ieee-ims.org/index.htm";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety8 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.engineering_in_medicine_and_biology_society));
                tvDescDetail.setText(getResources().getString(R.string.engineering_in_medicine_and_biology_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i8));
                societyLink = "https://www.embs.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety9 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.power_electronics_society));
                tvDescDetail.setText(getResources().getString(R.string.power_electronics_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i9));
                societyLink = "https://www.ieee-pels.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety10 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.industrial_electronics_society));
                tvDescDetail.setText(getResources().getString(R.string.industrial_electronics_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i10));
                societyLink = "http://www.ieee-ies.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety11 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.electron_devices_society));
                tvDescDetail.setText(getResources().getString(R.string.electron_devices_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i11));
                societyLink = "https://eds.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety12 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.microwave_theory_and_techniques_society));
                tvDescDetail.setText(getResources().getString(R.string.microwave_theory_and_techniques_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i12));
                societyLink = "https://www.mtt.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety13 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.computational_intelligence_society));
                tvDescDetail.setText(getResources().getString(R.string.computational_intelligence_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i13));
                societyLink = "https://cis.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety14 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.geoscience_and_remote_sensing_society));
                tvDescDetail.setText(getResources().getString(R.string.geoscience_and_remote_sensing_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i14));
                societyLink = "http://www.grss-ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety15 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.solid_state_circuits_society));
                tvDescDetail.setText(getResources().getString(R.string.solid_state_circuits_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i15));
                societyLink = "https://sscs.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety16 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.education_society));
                tvDescDetail.setText(getResources().getString(R.string.education_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i16));
                societyLink = "http://ieee-edusociety.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety17 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.signal_processing_society));
                tvDescDetail.setText(getResources().getString(R.string.signal_processing_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i17));
                societyLink = "https://signalprocessingsociety.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety18 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.women_in_engineering_affinity_group));
                tvDescDetail.setText(getResources().getString(R.string.women_in_engineering_affinity_group_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i18));
                societyLink = "http://wie.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety19 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.young_professionals_affinity_group));
                tvDescDetail.setText(getResources().getString(R.string.young_professionals_affinity_group_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i19));
                societyLink = "http://yp.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety20 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.ieee_brain));
                tvDescDetail.setText(getResources().getString(R.string.ieee_brain_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i20));
                societyLink = "https://brain.ieee.org/";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

            case R.id.cvSociety21 :

                setCardInvisible();
                tvHeadDetail.setText(getResources().getString(R.string.control_systems_society));
                tvDescDetail.setText(getResources().getString(R.string.control_systems_society_desc));
                ivLogoDetail.setImageDrawable(getResources().getDrawable(R.drawable.i21));
                societyLink = "http://www.ieeecss.org/\n";
                cvSocietyDetail.setVisibility(View.VISIBLE);

                break;

        }
    }

    public void setCardInvisible(){

        cvSociety1.setVisibility(View.GONE);
        cvSociety2.setVisibility(View.GONE);
        cvSociety3.setVisibility(View.GONE);
        cvSociety4.setVisibility(View.GONE);
        cvSociety5.setVisibility(View.GONE);
        cvSociety6.setVisibility(View.GONE);
        cvSociety7.setVisibility(View.GONE);
        cvSociety8.setVisibility(View.GONE);
        cvSociety9.setVisibility(View.GONE);
        cvSociety10.setVisibility(View.GONE);
        cvSociety11.setVisibility(View.GONE);
        cvSociety12.setVisibility(View.GONE);
        cvSociety13.setVisibility(View.GONE);
        cvSociety14.setVisibility(View.GONE);
        cvSociety15.setVisibility(View.GONE);
        cvSociety16.setVisibility(View.GONE);
        cvSociety17.setVisibility(View.GONE);
        cvSociety18.setVisibility(View.GONE);
        cvSociety19.setVisibility(View.GONE);
        cvSociety20.setVisibility(View.GONE);
        cvSociety21.setVisibility(View.GONE);
    }

    public void setCardVisible(){

        cvSociety1.setVisibility(View.VISIBLE);
        cvSociety2.setVisibility(View.VISIBLE);
        cvSociety3.setVisibility(View.VISIBLE);
        cvSociety4.setVisibility(View.VISIBLE);
        cvSociety5.setVisibility(View.VISIBLE);
        cvSociety6.setVisibility(View.VISIBLE);
        cvSociety7.setVisibility(View.VISIBLE);
        cvSociety8.setVisibility(View.VISIBLE);
        cvSociety9.setVisibility(View.VISIBLE);
        cvSociety10.setVisibility(View.VISIBLE);
        cvSociety11.setVisibility(View.VISIBLE);
        cvSociety12.setVisibility(View.VISIBLE);
        cvSociety13.setVisibility(View.VISIBLE);
        cvSociety14.setVisibility(View.VISIBLE);
        cvSociety15.setVisibility(View.VISIBLE);
        cvSociety16.setVisibility(View.VISIBLE);
        cvSociety17.setVisibility(View.VISIBLE);
        cvSociety18.setVisibility(View.VISIBLE);
        cvSociety19.setVisibility(View.VISIBLE);
        cvSociety20.setVisibility(View.VISIBLE);
        cvSociety21.setVisibility(View.VISIBLE);
    }


}
